package android.sabbir.com.modernlibrarys.activities;

import android.os.Bundle;
import android.sabbir.com.modernlibrarys.R;
import android.sabbir.com.modernlibrarys.databases.AppDatabase;
import android.sabbir.com.modernlibrarys.databases.DatabaseInitializer;
import android.sabbir.com.modernlibrarys.models.Book;
import android.sabbir.com.modernlibrarys.models.User;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;

public class RoomDbActivity extends AppCompatActivity {

    private AppDatabase mAppDatabase;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    //mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    fetchBookByUserNameLoan();
                   // mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_db);

        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mAppDatabase=AppDatabase.getInMemoryDatabase(getApplicationContext());

        populateDb();

        fetchData();
    }

    private void populateDb() {
       // DatabaseInitializer.populateSync(mAppDatabase); junky as doing on the main thread
        DatabaseInitializer.populateAsync(mAppDatabase);
    }

    private void fetchData() {
        // Note: this kind of logic should not be in an activity.
        StringBuilder sb = new StringBuilder();
        List<User> youngUsers = mAppDatabase.userModel().findUsersYoungerThan(35);
        for (User youngUser : youngUsers) {
            sb.append(String.format(Locale.US,
                    "%s, %s (%d)\n", youngUser.lastName, youngUser.name, youngUser.age));
        }
        mTextMessage.setText(sb);
    }

    private void fetchBookByUserNameLoan() {
        // This activity is executing a query on the main thread, making the UI perform badly.
        List<Book> books = mAppDatabase.bookModel().findBooksBorrowedByNameSync("Mike");
        showListInUI(books, mTextMessage);
    }

    private static void showListInUI(final @NonNull List<Book> books,
                                     final TextView booksTextView) {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.title);
            sb.append("\n");
        }
        booksTextView.setText(sb.toString());
    }

}
