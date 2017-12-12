/*
 * Copyright 2017, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.sabbir.com.modernlibrarys.activities;

import android.app.Application;

import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.sabbir.com.modernlibrarys.databases.AppDatabase;
import android.sabbir.com.modernlibrarys.databases.DatabaseInitializer;
import android.sabbir.com.modernlibrarys.models.Book;


import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class BooksBorrowedByUserViewModel extends AndroidViewModel {

    public final LiveData<List<Book>> books;

    private AppDatabase mDb;

    public BooksBorrowedByUserViewModel(Application application) {
        super(application);
        createDb();

        // TODO: Assign books to the 'findBooksBorrowedByName' query.
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        Date yesterday = calendar.getTime();
        books = mDb.bookModel().findBooksBorrowedByNameAfter("Mike", yesterday);
      //  books = mDb.bookModel().findBooksBorrowedByName("Mike");
    }

    public void createDb() {
        mDb = AppDatabase.getInMemoryDatabase(this.getApplication());

        // Populate it with initial data
        DatabaseInitializer.populateAsync(mDb);
    }
}