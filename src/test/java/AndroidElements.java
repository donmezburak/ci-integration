
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AndroidElements {

    public static final String Back = "com.otelz.mobil:id/ivBackFacilityDetail";

    //Welcome Sliders
    public static final String XPSliderFirstDot ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView";
    public static final String XPSliderSecondDot ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ImageView";
    public static final String XPSliderThirdDot ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.ImageView";
    public static final String IDSliderSkip ="com.otelz.mobil:id/materialButton";
    public static final String IDSliderContinue ="com.otelz.mobil:id/materialButtonContinue";
    public static final String IDUpdateLater ="android:id/button2";

    //Left Menu
    public static final String XPLeftMenuOpen ="//android.widget.ImageButton[@content-desc=\"Tamam\"]";
    public static final String XPLeftMenuClose ="//android.widget.ImageButton[@content-desc=\"İptal\"]";
    public static final String XPLeftMenuSignInUpItem ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout";
    public static final String IDLeftMenuManageReservationItem ="com.otelz.mobil:id/manage_booking_menu_item";
    public static final String IDLeftMenuReservationQueryItem ="com.otelz.mobil:id/search_reservation_menu_item";
    public static final String IDLeftMenuCurrencyItem ="com.otelz.mobil:id/currency_menu_item";
    public static final String IDLeftMenuLogOutItem ="com.otelz.mobil:id/log_out_menu_item";


    //Register Page
    public static final String IDRegisterManuelCloseButton ="com.otelz.mobil:id/ivLoginFragmentClose";
    public static final String IDRegisterCreateAccountButton ="com.otelz.mobil:id/btnLoginCreateAccount";
    public static final String IDRegisterNameBox ="com.otelz.mobil:id/etName";
    public static final String IDRegisterSurnameBox ="com.otelz.mobil:id/etSurname";
    public static final String IDRegisterMailBox ="com.otelz.mobil:id/etEmail";
    public static final String IDRegisterPassword ="com.otelz.mobil:id/etPassword";
    public static final String IDRegisterTermsCheck ="com.otelz.mobil:id/checkBox2";
    public static final String IDRegisterNotificationsCheck ="com.otelz.mobil:id/checkBoxConfirmation";
    public static final String IDRegisterRegisterButton ="com.otelz.mobil:id/materialButton3";

    //Login Page
    public static final String IDSignInWithEmail ="com.otelz.mobil:id/cardLoginWithEmail";
    public static final String IDSignInWithFacebook ="com.otelz.mobil:id/cardLoginWithFacebook";
    public static final String IDSignInWithGoogle ="com.otelz.mobil:id/btnLoginWithGoogle";
    public static final String IDSignInShowPasswordButton ="com.otelz.mobil:id/text_input_end_icon";
    public static final String IDSignInLoginButton ="com.otelz.mobil:id/btnSignInByEmail";
    public static final String IDSignInEmailBox ="com.otelz.mobil:id/etEmail";
    public static final String IDSignInPasswordBox ="com.otelz.mobil:id/etPassword";
    public static final String IDSignInForgotPasswordBox ="com.otelz.mobil:id/tvSubmit";
    public static final String IDSignInManuelCloseButton ="com.otelz.mobil:id/ivLoginWithEmailClose";
    public static final String IDSignInWrongPassOkButton ="android:id/button1";

    //Forgot Password
    public static final String IDForgotPasswordEmailBox ="com.otelz.mobil:id/etEmail";
    public static final String IDForgotPasswordSendEmailButton ="com.otelz.mobil:id/button2";
    public static final String IDForgotPasswordBackButton ="com.otelz.mobil:id/ivBackForgotPasswordToSignInByEmail";

    //Home Search
    public static final String IDHomeSearchLocationButton ="com.otelz.mobil:id/tvSearchHome";
    public static final String IDHomeSearchLocationBox ="com.otelz.mobil:id/search_src_text";
    public static final String IDHomeSearchShowMoreAreas ="com.otelz.mobil.search:id/tvShowMorePopular";
    public static final String XPSearchFirstLocationInList ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]";
    public static final String SelectFirstOtel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]";

    //public static final String XPSearchFirstLocationInList ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]";
    public static final String XPSearchSecondLocationInList ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]";
    public static final String XPSearchThirdLocationInList ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[3]";


    public static final String IDHomeSearchChildCount ="com.otelz.mobil:id/cardChildCountHome";
    public static final String IDHomeSearchIncreaseChildCount ="com.otelz.mobil:id/btnIncreaseChild";
    public static final String IDHomeSearchDecreaseChildCount ="com.otelz.mobil:id/btnDecreaseChild";

    public static final String IDHomeSearchRoomCount ="com.otelz.mobil:id/cardRoomCountHome";
    public static final String IDHomeSearchIncreaseRoomCount ="com.otelz.mobil:id/btnDecreaseRoomCount";
    public static final String IDHomeSearchDecreaseRoomCount ="com.otelz.mobil:id/btnIncreaseRoomCount";

    public static final String IDHomeSearchIncreaseAdultCountPopUp ="com.otelz.mobil:id/btnIncreaseAdult";
    public static final String IDHomeSearchDecreaseAdultCountPopUp ="com.otelz.mobil:id/btnDecreaseAdult";

    public static final String IDHomeSearchIncreaseAdultCount ="com.otelz.mobil:id/btnIncreaseAdult";
    public static final String IDHomeSearchDecreaseAdultCount ="com.otelz.mobil:id/btnDecreaseAdult";

    public static final String IDHomePopupFilterApply ="com.otelz.mobil:id/btnApplyMoreOptions";
    public static final String XPHomePopupFilterClose ="//android.widget.ImageButton[@content-desc=\"Yukarı git\"]";

    public static final String IDSearchSearchButton ="com.otelz.mobil:id/llSearchHome";

    public static final String IDHomeSearchDateStart ="com.otelz.mobil:id/layoutCheckInDate";
    public static final String IDHomeSearchDateEnd ="com.otelz.mobil:id/layoutCheckOutDate";
    public static final String IDHomeSearchSelectButton ="com.otelz.mobil:id/relativeBtnChooseDate";
    public static final String IDHomeSearchTonight ="com.otelz.mobil:id/frameSearchForToNight";

    //Home Tabs

    public static final String XPTabHotels ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[1]";
    public static final String XPTabApartmentVilla ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[2]";
    public static final String XPTabRoomForSale ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[3]";
    public static final String XPTabHotelOffice ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView[4]";

    //Search Result
    public static final String IDSearchResultChangeSearchButton ="com.otelz.mobil:id/btnChangeSearch";
    public static final String IDSearchResultOrderButton ="com.otelz.mobil:id/tvSortFacilityList";
    public static final String XPSearchResultFilterButton ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]";
    public static final String XPSearchResultMapButton ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[3]";
    public static final String IDSearchResultNextButton ="com.otelz.mobil:id/button2";
    public static final String XPSearchResultBackButton ="//android.widget.ImageButton[@content-desc=\"Yukarı git\"]";
    public static final String XPSearchOtel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]";
    public static final String XPSearchResultHotel1 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]";
    public static final String XPSearchResultHotel2 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]";
    public static final String XPSearchResultHotel3 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]";

    //Search Result Order Page
    public static final String IDSearchResultOrderByPopularity ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]";
    public static final String XPSearchResultOrderByStar15 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]";
    public static final String XPSearchResultOrderByStar51 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]";
    public static final String XPSearchResultOrderByPointAverage ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]";
    public static final String XPSearchResultOrderByPointHighLow ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]";
    public static final String XPSearchResultOrderByLowestPrice ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]";
    public static final String XPSearchResultOrderByHighestPrice ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]";

    //Search Result Filter Page
    public static final String IDSearchResultFilterPriceMoreButton ="com.otelz.mobil:id/btnShowMoreItem";
    public static final String XPSearchResultFilterPrice1 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]";
    public static final String XPSearchResultFilterPrice2 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]";
    public static final String XPSearchResultFilterPrice3 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]";
    public static final String XPSearchResultFilterPrice4 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]";
    public static final String XPSearchResultFilterPrice5 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]";
    public static final String XPSearchResultFilterPrice6 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[6]";
    public static final String XPSearchResultFilterPrice7 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[7]";

    public static final String XPSearchResultFilterDiscount1 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterDiscount2 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterDiscount3 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterDiscount4 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.LinearLayout";

    public static final String XPSearchResultFilterPopular1 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterPopular2 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterPopular3 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterPopular4 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.LinearLayout";

    public static final String XPSearchResultFilterStar1 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterStar2 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterStar3 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterStar4 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout";

    public static final String XPSearchResultFilterFood1 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterFood2 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterFood3 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterFood4 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterFood5 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterFood6 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[6]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterFood7 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[7]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterFood8 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[8]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterFoodShowMoreButton ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.Button";

    public static final String XPSearchResultFilterDistrict1 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterDistrict2 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterDistrict3 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout";
    public static final String XPSearchResultFilterDistrictShowMoreButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.Button";


    public static final String IDSearchResultFilterApplyButton ="com.otelz.mobil:id/btnShowResult";
    public static final String XPSearchResultFilterClearButton ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]";


    //Hotel Details
    public static final String IDHotelDetailRoomInfo ="com.otelz.mobil:id/frameRoomInfo";


    //Reservation
    public static final String IDReservationStartButton ="com.otelz.mobil:id/tvMinPriceNightRoomAdultCounts";
    public static final String IDReservationPersonInfoNameBox ="com.otelz.mobil:id/tvPersonalInfoName";
    public static final String IDReservationPersonInfoSurnameBox ="com.otelz.mobil:id/tvPersonalInfoSurname";
    public static final String IDReservationPersonInfoMailBox ="com.otelz.mobil:id/tvPersonalInfoMail";
    public static final String IDReservationPersonInfoOpenPhoneCodeSelect ="com.otelz.mobil:id/etPersonalInfoPhoneCode";
    public static final String XPReservationPersonInfoPhoneCodeSelect1  ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]";//Turkey
    public static final String XPReservationPersonInfoPhoneCodeSelect2  ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]";
    public static final String XPReservationPersonInfoPhoneCodeSelect3  ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]";
    public static final String IDReservationPersonInfoPhoneBox ="com.otelz.mobil:id/tvPersonalInfoPhone";
    public static final String IDReservationPersonInfoOpenCountrySelect ="com.otelz.mobil:id/tvPersonalInfoCountry";
    public static final String XPReservationPersonInfoCountrySelect1 ="hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]";//Turkey
    public static final String XPReservationPersonInfoCountrySelect2 ="hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]";//Turkey
    public static final String XPReservationPersonInfoCountrySelect3 ="hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]";//Turkey
    public static final String IDReservationPersonInfoSaveInfoCheck ="com.otelz.mobil:id/checkBoxSaveInfo";
    public static final String IDReservationPersonInfoAgreementCheck1 ="com.otelz.mobil:id/checkBoxIllumination"; //Aydınlatma rıza metni
    public static final String IDReservationPersonInfoAgreementCheck2 ="com.otelz.mobil:id/checkBoxPermission"; //Aydınlatma rıza metni kişisel veriler
    public static final String IDReservationPersonInfoNextButton ="com.otelz.mobil:id/btnPersonalInfoNext2";
    public static final String IDReservationCouponUseButton ="com.otelz.mobil.reservationSteps:id/tvCouponUse";
    public static final String IDReservationCouponBox ="com.otelz.mobil:id/etCouponCode";
    public static final String IDReservationCouponManuelApplyButton ="com.otelz.mobil:id/button4";
    public static final String IDReservationCouponListApplyButton ="com.otelz.mobil:id/btnUseCoupon";
    public static final String IDReservationCouponNextButton ="com.otelz.mobil:id/btnPersonalInfoNext";
    public static final String IDReservationPlaceReservationButton ="com.otelz.mobil:id/btnPersonalInfoNext";
    public static final String IDReservationCouponWindowTitle ="com.otelz.mobil:id/frameTitle";

    public static final String IDReservationNextBtn = "com.otelz.mobil.reservationSteps:id/btnPersonalInfoNext";


    //Common Elements
    public static final String IDCommonGoBack ="com.otelz.mobil:id/ivBackFacilityDetail";
    public static final String IDAllowWhileUsing ="com.android.permissioncontroller:id/permission_allow_foreground_only_button";
    public static final String IdAndroidAlertBox ="android:id/button1";

    //EmptyForCopy
    public static final String IDEmptyForCopy ="";

    //odeme
    public static final String IDOdemeOnline = "com.otelz.mobil.reservationSteps:id/rlPaymentTypeOnline";
    public static final String XPOdemeHavale = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]";
    public static final String XPOdemeCard = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]";
    public static final String IDOdemeNoCard = "com.otelz.mobil.reservationSteps:id/rlPaymentTypeNoCard";
    public static final String IDCardName = "com.otelz.mobil.reservationSteps:id/tvCustomerCardName";
    public static final String IDCardNo = "com.otelz.mobil.reservationSteps:id/tvCustomerCardNo";
    public static final String IDCardCVV = "com.otelz.mobil.reservationSteps:id/tvCustomerCardCvv";
    public static final String IDCardDate = "com.otelz.mobil.reservationSteps:id/tvCustomerCardExpirationDate";

    //language

    public static final String IDLanguageItem = "com.otelz.mobil:id/language_menu_item";
    public static final String IDLanguageEn = "com.otelz.mobil:id/tv_language_english";
    public static final String IDLanguageTr = "com.otelz.mobil:id/tv_language_turkish";
    public static final String XPLeftMenuEn = "//android.widget.ImageButton[@content-desc=\"OK\"]";

    //reservation Cancel
    public static final String IDReservationBack = "com.otelz.mobil.reservationSteps:id/ivReservationBack";
    public static final String IDBookingItem = "com.otelz.mobil:id/manage_booking_menu_item";
    public static final String IDMyBookingItem = "com.otelz.mobil:id/my_reservations_menu_item";
    public static final String IDBookingRecord = "com.otelz.mobil:id/constraintRecord";
    public static final String IDBookingScroll = "com.otelz.mobil:id/nestedScrollView";
    public static final String IDReservationCancel = "com.otelz.mobil:id/btnCancelReservation";
    public static final String IDKesinIptalBtn = "com.otelz.mobil:id/materialButton2";
    public static final String IDReason = "com.otelz.mobil:id/tvReason";
    public static final String XPReasonSelect = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]";
    public static final String IDReservationCancelOkBtn = "com.otelz.mobil:id/button2";

    //change money
    public static final String XPMoneyText = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView";
    public static final String XPSelectEuro = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]";

    //story
    public static final String XPStoryOne = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]";
    public static final String IDMainContent = "com.otelz.mobil:id/storyly_dialog_layout";

    //live support
    public static final String IdLiveSupport = "com.otelz.mobil:id/live_chat_menu_item";

    //oda detayı
    public static final String IDOdaSecenekleri = "com.otelz.mobil:id/btnChooseRoom";
    public static final String XPSelectFirstOda = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]";
    public static final String IDOdaPhoto = "com.otelz.mobil:id/viewPager";
    public static final String IDOdaPhotoClose = "com.otelz.mobil:id/ivCloseZoom";
    public static final String IDOdaPrice = "com.otelz.mobil:id/tvRoomPrice";

    //tesis takip
    public static final String IDTesisScroll = "com.otelz.mobil:id/nestedScrollView";
    public static final String IDTesisFollow = "com.otelz.mobil:id/tvFavoriteStatus";
    public static final String IDFollowList = "com.otelz.mobil:id/follow_list_menu_item";

    //free cancel
    public static final String XPSelectSecondRoom = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]";
    public static final String IDReservationYonet = "com.otelz.mobil.reservationSteps:id/btnReservationDetail";

    //map - city
    public static final String XPHotelMap = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[3]";

    //map - hotel
    public static final String IDHotelMap = "com.otelz.mobil:id/tvMap";

    //change date
    public static final String IDSelectFirstDate = "com.otelz.mobil:id/textView29";

    //follow reservation
    public static final String XPFirstFavoriteHotel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView";
    public static final String IDSelectRoom = "com.otelz.mobil:id/textView25";
    //coupon reservation
    public static final String IDCouponItem = "com.otelz.mobil:id/coupons_menu_item";
    public static final String XPSelectCoupon = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView";
    public static final String XPSelectFirstHotel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.RelativeLayout";

}
