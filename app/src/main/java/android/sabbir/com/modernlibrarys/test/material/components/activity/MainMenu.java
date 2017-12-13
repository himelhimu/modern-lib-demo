package android.sabbir.com.modernlibrarys.test.material.components.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.activity.bottomnavigation.BottomNavigationBasic;
import com.material.components.activity.bottomnavigation.BottomNavigationDark;
import com.material.components.activity.bottomnavigation.BottomNavigationIcon;
import com.material.components.activity.bottomnavigation.BottomNavigationLight;
import com.material.components.activity.bottomnavigation.BottomNavigationShifting;
import com.material.components.activity.bottomsheet.BottomSheetBasic;
import com.material.components.activity.bottomsheet.BottomSheetFloating;
import com.material.components.activity.bottomsheet.BottomSheetFull;
import com.material.components.activity.bottomsheet.BottomSheetList;
import com.material.components.activity.bottomsheet.BottomSheetMap;
import com.material.components.activity.button.ButtonBasic;
import com.material.components.activity.button.ButtonInUtilities;
import com.material.components.activity.button.FabMiddle;
import com.material.components.activity.button.FabMore;
import com.material.components.activity.button.FabMoreText;
import com.material.components.activity.card.CardBasic;
import com.material.components.activity.card.CardOverlap;
import com.material.components.activity.card.CardTimeline;
import com.material.components.activity.card.CardWizard;
import com.material.components.activity.card.CardWizardLight;
import com.material.components.activity.card.CardWizardOverlap;
import com.material.components.activity.chip.ChipBasic;
import com.material.components.activity.chip.ChipTag;
import com.material.components.activity.dialog.DialogAddPost;
import com.material.components.activity.dialog.DialogAddReview;
import com.material.components.activity.dialog.DialogBasic;
import com.material.components.activity.dialog.DialogCustom;
import com.material.components.activity.dialog.DialogCustomDark;
import com.material.components.activity.dialog.DialogCustomInfo;
import com.material.components.activity.dialog.DialogCustomLight;
import com.material.components.activity.dialog.DialogCustomWarning;
import com.material.components.activity.dialog.DialogFullscreen;
import com.material.components.activity.expansionpanel.ExpansionPanelBasic;
import com.material.components.activity.expansionpanel.ExpansionPanelInvoice;
import com.material.components.activity.expansionpanel.ExpansionPanelTicket;
import com.material.components.activity.form.FormLogin;
import com.material.components.activity.form.FormProfileData;
import com.material.components.activity.form.FormSignUp;
import com.material.components.activity.form.FormTextArea;
import com.material.components.activity.form.FormWithIcon;
import com.material.components.activity.gridlist.GridAlbums;
import com.material.components.activity.gridlist.GridBasic;
import com.material.components.activity.gridlist.GridCaller;
import com.material.components.activity.gridlist.GridSectioned;
import com.material.components.activity.gridlist.GridSingleLine;
import com.material.components.activity.gridlist.GridTwoLine;
import com.material.components.activity.list.ListAnimation;
import com.material.components.activity.list.ListBasic;
import com.material.components.activity.list.ListDrag;
import com.material.components.activity.list.ListExpand;
import com.material.components.activity.list.ListMultiSelection;
import com.material.components.activity.list.ListSectioned;
import com.material.components.activity.list.ListSwipe;
import com.material.components.activity.menu.MenuDrawerMail;
import com.material.components.activity.menu.MenuDrawerNews;
import com.material.components.activity.menu.MenuDrawerNoIcon;
import com.material.components.activity.menu.MenuDrawerSimpleDark;
import com.material.components.activity.menu.MenuDrawerSimpleLight;
import com.material.components.activity.menu.MenuOverflowList;
import com.material.components.activity.menu.MenuOverflowToolbar;
import com.material.components.activity.noitem.NoItemArchived;
import com.material.components.activity.noitem.NoItemBgCactus;
import com.material.components.activity.noitem.NoItemBgCity;
import com.material.components.activity.noitem.NoItemInternetIcon;
import com.material.components.activity.noitem.NoItemInternetImage;
import com.material.components.activity.noitem.NoItemSearch;
import com.material.components.activity.noitem.NoItemTabs;
import com.material.components.activity.picker.PickerColor;
import com.material.components.activity.picker.PickerDateDark;
import com.material.components.activity.picker.PickerDateLight;
import com.material.components.activity.picker.PickerLocation;
import com.material.components.activity.picker.PickerTimeDark;
import com.material.components.activity.picker.PickerTimeLight;
import com.material.components.activity.player.PlayerMusicAlbumCircle;
import com.material.components.activity.player.PlayerMusicAlbumDark;
import com.material.components.activity.player.PlayerMusicAlbumGrid;
import com.material.components.activity.player.PlayerMusicAlbumSimple;
import com.material.components.activity.player.PlayerMusicBasic;
import com.material.components.activity.player.PlayerMusicLight;
import com.material.components.activity.player.PlayerMusicSongList;
import com.material.components.activity.player.PlayerMusicTabs;
import com.material.components.activity.player.PlayerMusicTabsIcon;
import com.material.components.activity.profile.ProfileBlueAppbar;
import com.material.components.activity.profile.ProfileDrawerImage;
import com.material.components.activity.profile.ProfileDrawerSimple;
import com.material.components.activity.profile.ProfileGallery;
import com.material.components.activity.profile.ProfileGalleryTwo;
import com.material.components.activity.profile.ProfileImageAppbar;
import com.material.components.activity.profile.ProfilePolygon;
import com.material.components.activity.profile.ProfilePurple;
import com.material.components.activity.profile.ProfileRed;
import com.material.components.activity.progressactivity.ProgressBasic;
import com.material.components.activity.progressactivity.ProgressCircleCenter;
import com.material.components.activity.progressactivity.ProgressLinearCenter;
import com.material.components.activity.progressactivity.ProgressLinearTop;
import com.material.components.activity.progressactivity.ProgressOnScroll;
import com.material.components.activity.progressactivity.ProgressPullRefresh;
import com.material.components.activity.search.SearchCity;
import com.material.components.activity.search.SearchHistoryCard;
import com.material.components.activity.search.SearchPrimary;
import com.material.components.activity.search.SearchPrimaryBg;
import com.material.components.activity.search.SearchStore;
import com.material.components.activity.search.SearchToolbarDark;
import com.material.components.activity.search.SearchToolbarLight;
import com.material.components.activity.shopping.ShoppingCategoryCard;
import com.material.components.activity.shopping.ShoppingCategoryImage;
import com.material.components.activity.shopping.ShoppingCategoryList;
import com.material.components.activity.shopping.ShoppingCheckoutCard;
import com.material.components.activity.shopping.ShoppingProductAdvDetails;
import com.material.components.activity.shopping.ShoppingProductDetails;
import com.material.components.activity.shopping.ShoppingProductGrid;
import com.material.components.activity.shopping.ShoppingSubCategoryTabs;
import com.material.components.activity.slider.SliderColorPicker;
import com.material.components.activity.slider.SliderDark;
import com.material.components.activity.slider.SliderLight;
import com.material.components.activity.sliderimage.SliderImageCard;
import com.material.components.activity.sliderimage.SliderImageCardAuto;
import com.material.components.activity.sliderimage.SliderImageHeader;
import com.material.components.activity.sliderimage.SliderImageHeaderAuto;
import com.material.components.activity.snackbartoast.SnackbarAndFab;
import com.material.components.activity.snackbartoast.SnackbarToastBasic;
import com.material.components.activity.stepper.StepperDots;
import com.material.components.activity.stepper.StepperProgress;
import com.material.components.activity.stepper.StepperText;
import com.material.components.activity.stepper.StepperVertical;
import com.material.components.activity.stepper.StepperWizardColor;
import com.material.components.activity.stepper.StepperWizardLight;
import com.material.components.activity.tabs.TabsBasic;
import com.material.components.activity.tabs.TabsDark;
import com.material.components.activity.tabs.TabsIcon;
import com.material.components.activity.tabs.TabsIconLight;
import com.material.components.activity.tabs.TabsIconStack;
import com.material.components.activity.tabs.TabsLight;
import com.material.components.activity.tabs.TabsRound;
import com.material.components.activity.tabs.TabsScroll;
import com.material.components.activity.tabs.TabsStore;
import com.material.components.activity.tabs.TabsTextIcon;
import com.material.components.activity.timeline.TimelineDotCard;
import com.material.components.activity.timeline.TimelineFeed;
import com.material.components.activity.timeline.TimelinePath;
import com.material.components.activity.timeline.TimelineSimple;
import com.material.components.activity.timeline.TimelineTwitter;
import com.material.components.activity.toolbar.ToolbarBasic;
import com.material.components.activity.toolbar.ToolbarCollapse;
import com.material.components.activity.toolbar.ToolbarCollapsePin;
import com.material.components.activity.toolbar.ToolbarDark;
import com.material.components.activity.toolbar.ToolbarLight;
import com.material.components.p086a.ac;
import com.material.components.p086a.ac.C2219c;
import com.material.components.p086a.ac.C2220d;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2730e;
import java.util.ArrayList;
import java.util.List;

public class MainMenu extends C0818e {
    private RecyclerView f6009m;
    private ac f6010n;
    private long f6011o = 0;

    class C23521 implements C2220d {
        final /* synthetic */ MainMenu f6005a;

        C23521(MainMenu mainMenu) {
            this.f6005a = mainMenu;
        }

        public void mo1924a(View view, int i) {
            this.f6005a.m11146b(i);
        }
    }

    class C23532 implements OnClickListener {
        final /* synthetic */ MainMenu f6006a;

        C23532(MainMenu mainMenu) {
            this.f6006a = mainMenu;
        }

        public void onClick(View view) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://codecanyon.net/user/dream_space/portfolio"));
            this.f6006a.startActivity(intent);
        }
    }

    private void m11146b(int i) {
        switch (i) {
            case 90:
                m11149m();
                return;
            case 101:
                startActivity(new Intent(this, BottomNavigationBasic.class));
                return;
            case 102:
                startActivity(new Intent(this, BottomNavigationShifting.class));
                return;
            case 103:
                startActivity(new Intent(this, BottomNavigationLight.class));
                return;
            case 104:
                startActivity(new Intent(this, BottomNavigationDark.class));
                return;
            case 105:
                startActivity(new Intent(this, BottomNavigationIcon.class));
                return;
            case 201:
                startActivity(new Intent(this, BottomSheetBasic.class));
                return;
            case 202:
                startActivity(new Intent(this, BottomSheetList.class));
                return;
            case 203:
                startActivity(new Intent(this, BottomSheetMap.class));
                return;
            case 204:
                startActivity(new Intent(this, BottomSheetFloating.class));
                return;
            case 205:
                startActivity(new Intent(this, BottomSheetFull.class));
                return;
            case 301:
                startActivity(new Intent(this, ButtonBasic.class));
                return;
            case 302:
                startActivity(new Intent(this, ButtonInUtilities.class));
                return;
            case 303:
                startActivity(new Intent(this, FabMiddle.class));
                return;
            case 304:
                startActivity(new Intent(this, FabMore.class));
                return;
            case 305:
                startActivity(new Intent(this, FabMoreText.class));
                return;
            case 401:
                startActivity(new Intent(this, CardBasic.class));
                return;
            case 402:
                startActivity(new Intent(this, CardTimeline.class));
                return;
            case 403:
                startActivity(new Intent(this, CardOverlap.class));
                return;
            case 404:
                startActivity(new Intent(this, CardWizard.class));
                return;
            case 405:
                startActivity(new Intent(this, CardWizardLight.class));
                return;
            case 406:
                startActivity(new Intent(this, CardWizardOverlap.class));
                return;
            case 501:
                startActivity(new Intent(this, ChipBasic.class));
                return;
            case 502:
                startActivity(new Intent(this, ChipTag.class));
                return;
            case 601:
                startActivity(new Intent(this, DialogBasic.class));
                return;
            case 602:
                startActivity(new Intent(this, DialogFullscreen.class));
                return;
            case 603:
                startActivity(new Intent(this, DialogCustom.class));
                return;
            case 604:
                startActivity(new Intent(this, DialogCustomInfo.class));
                return;
            case 605:
                startActivity(new Intent(this, DialogCustomWarning.class));
                return;
            case 606:
                startActivity(new Intent(this, DialogCustomLight.class));
                return;
            case 607:
                startActivity(new Intent(this, DialogCustomDark.class));
                return;
            case 608:
                startActivity(new Intent(this, DialogAddPost.class));
                return;
            case 609:
                startActivity(new Intent(this, DialogAddReview.class));
                return;
            case 701:
                startActivity(new Intent(this, ExpansionPanelBasic.class));
                return;
            case 702:
                startActivity(new Intent(this, ExpansionPanelInvoice.class));
                return;
            case 703:
                startActivity(new Intent(this, ExpansionPanelTicket.class));
                return;
            case 801:
                startActivity(new Intent(this, GridBasic.class));
                return;
            case 802:
                startActivity(new Intent(this, GridSingleLine.class));
                return;
            case 803:
                startActivity(new Intent(this, GridTwoLine.class));
                return;
            case 804:
                startActivity(new Intent(this, GridSectioned.class));
                return;
            case 805:
                startActivity(new Intent(this, GridAlbums.class));
                return;
            case 806:
                startActivity(new Intent(this, GridCaller.class));
                return;
            case 901:
                startActivity(new Intent(this, ListBasic.class));
                return;
            case 902:
                startActivity(new Intent(this, ListSectioned.class));
                return;
            case 903:
                startActivity(new Intent(this, ListAnimation.class));
                return;
            case 904:
                startActivity(new Intent(this, ListExpand.class));
                return;
            case 905:
                startActivity(new Intent(this, ListDrag.class));
                return;
            case 906:
                startActivity(new Intent(this, ListSwipe.class));
                return;
            case 907:
                startActivity(new Intent(this, ListMultiSelection.class));
                return;
            case 1001:
                startActivity(new Intent(this, PickerDateLight.class));
                return;
            case 1002:
                startActivity(new Intent(this, PickerDateDark.class));
                return;
            case 1003:
                startActivity(new Intent(this, PickerTimeLight.class));
                return;
            case 1004:
                startActivity(new Intent(this, PickerTimeDark.class));
                return;
            case 1005:
                startActivity(new Intent(this, PickerColor.class));
                return;
            case 1006:
                startActivity(new Intent(this, PickerLocation.class));
                return;
            case 1101:
                startActivity(new Intent(this, ProgressBasic.class));
                return;
            case 1102:
                startActivity(new Intent(this, ProgressLinearCenter.class));
                return;
            case 1103:
                startActivity(new Intent(this, ProgressLinearTop.class));
                return;
            case 1104:
                startActivity(new Intent(this, ProgressCircleCenter.class));
                return;
            case 1105:
                startActivity(new Intent(this, ProgressOnScroll.class));
                return;
            case 1106:
                startActivity(new Intent(this, ProgressPullRefresh.class));
                return;
            case 1201:
                startActivity(new Intent(this, SliderLight.class));
                return;
            case 1202:
                startActivity(new Intent(this, SliderDark.class));
                return;
            case 1203:
                startActivity(new Intent(this, SliderColorPicker.class));
                return;
            case 1301:
                startActivity(new Intent(this, SnackbarToastBasic.class));
                return;
            case 1302:
                startActivity(new Intent(this, SnackbarAndFab.class));
                return;
            case 1401:
                startActivity(new Intent(this, StepperText.class));
                return;
            case 1402:
                startActivity(new Intent(this, StepperDots.class));
                return;
            case 1403:
                startActivity(new Intent(this, StepperProgress.class));
                return;
            case 1404:
                startActivity(new Intent(this, StepperVertical.class));
                return;
            case 1405:
                startActivity(new Intent(this, StepperWizardLight.class));
                return;
            case 1406:
                startActivity(new Intent(this, StepperWizardColor.class));
                return;
            case 1501:
                startActivity(new Intent(this, TabsBasic.class));
                return;
            case 1502:
                startActivity(new Intent(this, TabsStore.class));
                return;
            case 1503:
                startActivity(new Intent(this, TabsLight.class));
                return;
            case 1504:
                startActivity(new Intent(this, TabsDark.class));
                return;
            case 1505:
                startActivity(new Intent(this, TabsIcon.class));
                return;
            case 1506:
                startActivity(new Intent(this, TabsTextIcon.class));
                return;
            case 1507:
                startActivity(new Intent(this, TabsIconLight.class));
                return;
            case 1508:
                startActivity(new Intent(this, TabsIconStack.class));
                return;
            case 1509:
                startActivity(new Intent(this, TabsScroll.class));
                return;
            case 1510:
                startActivity(new Intent(this, TabsRound.class));
                return;
            case 1601:
                startActivity(new Intent(this, FormLogin.class));
                return;
            case 1602:
                startActivity(new Intent(this, FormSignUp.class));
                return;
            case 1603:
                startActivity(new Intent(this, FormProfileData.class));
                return;
            case 1604:
                startActivity(new Intent(this, FormWithIcon.class));
                return;
            case 1605:
                startActivity(new Intent(this, FormTextArea.class));
                return;
            case 1701:
                startActivity(new Intent(this, ToolbarBasic.class));
                return;
            case 1702:
                startActivity(new Intent(this, ToolbarCollapse.class));
                return;
            case 1703:
                startActivity(new Intent(this, ToolbarCollapsePin.class));
                return;
            case 1704:
                startActivity(new Intent(this, ToolbarLight.class));
                return;
            case 1705:
                startActivity(new Intent(this, ToolbarDark.class));
                return;
            case 1801:
                startActivity(new Intent(this, ProfilePolygon.class));
                return;
            case 1802:
                startActivity(new Intent(this, ProfilePurple.class));
                return;
            case 1803:
                startActivity(new Intent(this, ProfileRed.class));
                return;
            case 1804:
                startActivity(new Intent(this, ProfileBlueAppbar.class));
                return;
            case 1805:
                startActivity(new Intent(this, ProfileImageAppbar.class));
                return;
            case 1806:
                startActivity(new Intent(this, ProfileDrawerSimple.class));
                return;
            case 1807:
                startActivity(new Intent(this, ProfileDrawerImage.class));
                return;
            case 1808:
                startActivity(new Intent(this, ProfileGallery.class));
                return;
            case 1809:
                startActivity(new Intent(this, ProfileGalleryTwo.class));
                return;
            case 2001:
                startActivity(new Intent(this, MenuDrawerNews.class));
                return;
            case 2002:
                startActivity(new Intent(this, MenuDrawerMail.class));
                return;
            case 2003:
                startActivity(new Intent(this, MenuDrawerSimpleLight.class));
                return;
            case 2004:
                startActivity(new Intent(this, MenuDrawerSimpleDark.class));
                return;
            case 2005:
                startActivity(new Intent(this, MenuDrawerNoIcon.class));
                return;
            case 2006:
                startActivity(new Intent(this, MenuOverflowToolbar.class));
                return;
            case 2007:
                startActivity(new Intent(this, MenuOverflowList.class));
                return;
            case 19001:
                startActivity(new Intent(this, NoItemArchived.class));
                return;
            case 19002:
                startActivity(new Intent(this, NoItemSearch.class));
                return;
            case 19003:
                startActivity(new Intent(this, NoItemInternetIcon.class));
                return;
            case 19004:
                startActivity(new Intent(this, NoItemInternetImage.class));
                return;
            case 19005:
                startActivity(new Intent(this, NoItemBgCity.class));
                return;
            case 19006:
                startActivity(new Intent(this, NoItemBgCactus.class));
                return;
            case 19007:
                startActivity(new Intent(this, NoItemTabs.class));
                return;
            case 20001:
                startActivity(new Intent(this, PlayerMusicBasic.class));
                return;
            case 20002:
                startActivity(new Intent(this, PlayerMusicLight.class));
                return;
            case 20003:
                startActivity(new Intent(this, PlayerMusicAlbumDark.class));
                return;
            case 20004:
                startActivity(new Intent(this, PlayerMusicAlbumCircle.class));
                return;
            case 20005:
                startActivity(new Intent(this, PlayerMusicAlbumSimple.class));
                return;
            case 20006:
                startActivity(new Intent(this, PlayerMusicSongList.class));
                return;
            case 20007:
                startActivity(new Intent(this, PlayerMusicAlbumGrid.class));
                return;
            case 20008:
                startActivity(new Intent(this, PlayerMusicTabs.class));
                return;
            case 20009:
                startActivity(new Intent(this, PlayerMusicTabsIcon.class));
                return;
            case 21001:
                startActivity(new Intent(this, TimelineFeed.class));
                return;
            case 21002:
                startActivity(new Intent(this, TimelinePath.class));
                return;
            case 21003:
                startActivity(new Intent(this, TimelineDotCard.class));
                return;
            case 21004:
                startActivity(new Intent(this, TimelineTwitter.class));
                return;
            case 21005:
                startActivity(new Intent(this, TimelineSimple.class));
                return;
            case 22001:
                startActivity(new Intent(this, ShoppingCategoryList.class));
                return;
            case 22002:
                startActivity(new Intent(this, ShoppingCategoryCard.class));
                return;
            case 22003:
                startActivity(new Intent(this, ShoppingCategoryImage.class));
                return;
            case 22004:
                startActivity(new Intent(this, ShoppingSubCategoryTabs.class));
                return;
            case 22005:
                startActivity(new Intent(this, ShoppingProductGrid.class));
                return;
            case 22006:
                startActivity(new Intent(this, ShoppingProductDetails.class));
                return;
            case 22007:
                startActivity(new Intent(this, ShoppingProductAdvDetails.class));
                return;
            case 22008:
                startActivity(new Intent(this, ShoppingCheckoutCard.class));
                return;
            case 23001:
                startActivity(new Intent(this, SearchToolbarLight.class));
                return;
            case 23002:
                startActivity(new Intent(this, SearchToolbarDark.class));
                return;
            case 23003:
                startActivity(new Intent(this, SearchStore.class));
                return;
            case 23004:
                startActivity(new Intent(this, SearchPrimary.class));
                return;
            case 23005:
                startActivity(new Intent(this, SearchPrimaryBg.class));
                return;
            case 23006:
                startActivity(new Intent(this, SearchHistoryCard.class));
                return;
            case 23007:
                startActivity(new Intent(this, SearchCity.class));
                return;
            case 24001:
                startActivity(new Intent(this, SliderImageHeader.class));
                return;
            case 24002:
                startActivity(new Intent(this, SliderImageHeaderAuto.class));
                return;
            case 24003:
                startActivity(new Intent(this, SliderImageCard.class));
                return;
            case 24004:
                startActivity(new Intent(this, SliderImageCardAuto.class));
                return;
            default:
                return;
        }
    }

    private void m11147k() {
        this.f6009m = (RecyclerView) findViewById(C1142R.id.main_recycler);
        this.f6010n = new ac(this, m11148l(), new C23521(this));
        this.f6010n.m10883h(1);
        this.f6009m.setLayoutManager(new LinearLayoutManager(this));
        this.f6009m.setNestedScrollingEnabled(false);
        this.f6009m.setAdapter(this.f6010n);
    }

    private List<C2219c> m11148l() {
        List<C2219c> arrayList = new ArrayList();
        arrayList.add(new C2219c(-1, null, -1, C2730e.DIVIDER));
        arrayList.add(new C2219c(100, "Bottom Navigation", C1142R.drawable.ic_view_column, C2730e.HEADER));
        arrayList.add(new C2219c(101, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(102, "Shifting", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(103, "Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(104, "Dark", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(105, "Icon", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(200, "Bottom Sheet", C1142R.drawable.ic_call_to_actio, C2730e.HEADER));
        arrayList.add(new C2219c(201, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(202, "List", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(203, "Map", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(204, "Floating", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(205, "Full", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(300, "Buttons", C1142R.drawable.ic_touch_app, C2730e.HEADER));
        arrayList.add(new C2219c(301, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(302, "Button In Utilities", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(303, "Fab Middle", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(304, "Fab More", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(305, "Fab More Text", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(400, "Cards", C1142R.drawable.ic_note, C2730e.HEADER));
        arrayList.add(new C2219c(401, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(402, "Timeline", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(403, "Overlap", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(404, "Wizard", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(405, "Wizard Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(406, "Wizard Overlap", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(500, "Chips", C1142R.drawable.ic_label, C2730e.HEADER));
        arrayList.add(new C2219c(501, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(502, "Tag", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(600, "Dialogs", C1142R.drawable.ic_picture_in_picture, C2730e.HEADER));
        arrayList.add(new C2219c(601, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(602, "Fullscreen", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(603, "Custom", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(604, "Custom Info", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(605, "Custom Warning", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(606, "Custom Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(607, "Custom Dark", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(608, "Custom Add Post", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(609, "Custom Add Review", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(700, "Expansion Panels", C1142R.drawable.ic_arrow_downward, C2730e.HEADER));
        arrayList.add(new C2219c(701, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(702, "Invoice", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(703, "Ticket", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(800, "Grid", C1142R.drawable.ic_apps, C2730e.HEADER));
        arrayList.add(new C2219c(801, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(802, "Single Line", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(803, "Two Line", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(804, "Sectioned", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(805, "Albums", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(806, "Caller", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(900, "Lists", C1142R.drawable.ic_view_stream, C2730e.HEADER));
        arrayList.add(new C2219c(901, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(902, "Sectioned", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(903, "Animation", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(904, "Expand", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(905, "Draggable", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(906, "Swipe", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(907, "Multi Selection", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(2000, "Menu", C1142R.drawable.ic_reoder, C2730e.HEADER));
        arrayList.add(new C2219c(2001, "Drawer News", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(2002, "Drawer Mail", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(2003, "Drawer Simple Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(2004, "Drawer Simple Dark", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(2005, "Drawer No Icon", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(2006, "Overflow Toolbar", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(2007, "Overflow List", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1000, "Pickers", C1142R.drawable.ic_event, C2730e.HEADER));
        arrayList.add(new C2219c(1001, "Date Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1002, "Date Dark", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1003, "Time Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1004, "Time Dark", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1005, "Color RGB", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1006, "Location", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1100, "Progress & Activity", C1142R.drawable.ic_settings_backup_restore, C2730e.HEADER));
        arrayList.add(new C2219c(1101, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1102, "Linear Center", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1103, "Linear Top", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1104, "Circle Center", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1105, "On Scroll", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1106, "Pull Refresh", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1200, "Sliders", C1142R.drawable.ic_tune, C2730e.HEADER));
        arrayList.add(new C2219c(1201, "Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1202, "Dark", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1203, "Color Picker", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1300, "Snackbars & Toasts", C1142R.drawable.ic_wb_iridescent, C2730e.HEADER));
        arrayList.add(new C2219c(1301, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1302, "Lift FAB", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1400, "Steppers", C1142R.drawable.ic_timeline, C2730e.HEADER));
        arrayList.add(new C2219c(1401, "Text", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1402, "Dots", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1403, "Progress", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1404, "Vertical", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1405, "Wizard Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1406, "Wizard Color", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1500, "Tabs", C1142R.drawable.ic_tabs, C2730e.HEADER));
        arrayList.add(new C2219c(1501, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1502, "Store", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1503, "Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1504, "Dark", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1505, "Icon", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1506, "Text & Icon", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1507, "Icon Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1508, "Icon Stack", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1509, "Scroll", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1510, "Round", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1600, "Form", C1142R.drawable.ic_assignment, C2730e.HEADER));
        arrayList.add(new C2219c(1601, "Login", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1602, "Sign Up", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1603, "Profile Data", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1604, "With Icon", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1605, "Text Area", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1700, "Toolbars", C1142R.drawable.ic_web_asset, C2730e.HEADER));
        arrayList.add(new C2219c(1701, "Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1702, "Collapse", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1703, "Collapse And Pin", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1704, "Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1705, "Dark", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(-1, "Extra", -1, C2730e.DIVIDER));
        arrayList.add(new C2219c(1800, "Profile", C1142R.drawable.ic_person, C2730e.HEADER));
        arrayList.add(new C2219c(1801, "Polygon", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1802, "Purple", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1803, "Red", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1804, "Blue Appbar", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1805, "Image Appbar", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1806, "Drawer Simple", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1807, "Drawer Image", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1808, "Gallery", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(1809, "Gallery Two", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(19000, "No Item Page", C1142R.drawable.ic_do_not_disturb_off, C2730e.HEADER));
        arrayList.add(new C2219c(19001, "Archived", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(19002, "Search", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(19003, "Internet Icon", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(19004, "Internet Image", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(19005, "Bg City", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(19006, "Bg Cactus", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(19007, "Tabs", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(20000, "Player", C1142R.drawable.ic_live_tv, C2730e.HEADER));
        arrayList.add(new C2219c(20001, "Music Basic", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(20002, "Music Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(20003, "Music Album Dark", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(20004, "Music Album Circle", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(20005, "Music Album Simple", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(20006, "Music Song List", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(20007, "Music Album Grid", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(20008, "Music Tabs", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(20009, "Music Tabs Icon", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(21000, "Timeline", C1142R.drawable.ic_wrap_text, C2730e.HEADER));
        arrayList.add(new C2219c(21001, "Timeline Feed", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(21002, "Timeline Path", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(21003, "Timeline Dot Card", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(21004, "Timeline Twitter", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(21005, "Timeline Simple", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(22000, "Shopping", C1142R.drawable.ic_shopping_cart, C2730e.HEADER));
        arrayList.add(new C2219c(22001, "Category List", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(22002, "Category Card", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(22003, "Category Image", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(22004, "Sub Category Tabs", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(22005, "Product Grid", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(22006, "Product Details", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(22007, "Product Adv Details", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(22008, "Checkout Card", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(23000, "Search Page", C1142R.drawable.ic_search, C2730e.HEADER));
        arrayList.add(new C2219c(23001, "Toolbar Light", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(23002, "Toolbar Dark", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(23003, "Store", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(23004, "Primary", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(23005, "Primary Bg", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(23006, "History Card", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(23007, "City", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(24000, "Slider Image", C1142R.drawable.ic_photo_library, C2730e.HEADER));
        arrayList.add(new C2219c(24001, "Header", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(24002, "Header Auto", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(24003, "Card", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(24004, "Card Auto", -1, C2730e.SUB_HEADER));
        arrayList.add(new C2219c(-1, "Application", -1, C2730e.DIVIDER));
        arrayList.add(new C2219c(90, "About", C1142R.drawable.ic_error_outline, C2730e.NORMAL));
        return arrayList;
    }

    private void m11149m() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C1142R.layout.dialog_about);
        dialog.setCancelable(true);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -2;
        layoutParams.height = -2;
        ((AppCompatButton) dialog.findViewById(C1142R.id.bt_getcode)).setOnClickListener(new C23532(this));
        ((AppCompatButton) dialog.findViewById(C1142R.id.bt_close)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ MainMenu f6008b;

            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }

    public void m11150j() {
        if (System.currentTimeMillis() - this.f6011o > 2000) {
            Toast.makeText(this, "Press again to exit app", 0).show();
            this.f6011o = System.currentTimeMillis();
            return;
        }
        finish();
    }

    public void onBackPressed() {
        m11150j();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_main);
        m11147k();
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_1000);
    }
}
