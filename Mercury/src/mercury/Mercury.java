package mercury;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mercury {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(css = "a[title='Read our blog, discover the resource center, and find job opportunities.']")
	@CacheLookup
	private WebElement about;

	@FindBy(css = "a[title='View your activity log']")
	@CacheLookup
	private WebElement activityLog;

	@FindBy(css = "a._41ug")
	@CacheLookup
	private WebElement adChoices;

	@FindBy(css = "#captcha div:nth-of-type(3) div:nth-of-type(1) a:nth-of-type(2)")
	@CacheLookup
	private WebElement anAudioCaptcha;

	@FindBy(id = "u_0_o")
	@CacheLookup
	private WebElement back;

	@FindBy(css = "#captcha div:nth-of-type(3) div:nth-of-type(2) a:nth-of-type(2)")
	@CacheLookup
	private WebElement backToText;

	@FindBy(css = "a[title='Make your next career move to our awesome company.']")
	@CacheLookup
	private WebElement careers;

	@FindBy(css = "a[title='Browse our Public Figures & Celebrities directory.']")
	@CacheLookup
	private WebElement celebrities;

	@FindBy(id = "cookie-use-link")
	@CacheLookup
	private WebElement cookieUse;

	@FindBy(css = "a[title='Learn about cookies and Facebook.']")
	@CacheLookup
	private WebElement cookies;

	@FindBy(css = "a[href='/pages/create/?ref_type=registration_form']")
	@CacheLookup
	private WebElement createAPage;

	@FindBy(id = "u_0_m")
	@CacheLookup
	private WebElement createAccount;

	@FindBy(css = "a[title='Advertise on Facebook.']")
	@CacheLookup
	private WebElement createAd;

	@FindBy(css = "a[title='Create a Page']")
	@CacheLookup
	private WebElement createPage;

	@FindBy(id = "privacy-link")
	@CacheLookup
	private WebElement dataPolicy;

	@FindBy(css = "a[title='German']")
	@CacheLookup
	private WebElement deutsch;

	@FindBy(css = "a[title='Develop on our platform.']")
	@CacheLookup
	private WebElement developers;

	@FindBy(id = "email")
	@CacheLookup
	private WebElement emailOrPhone;

	@FindBy(id = "captcha_response")
	@CacheLookup
	private WebElement enterTheTextYouSeeAbove;

	@FindBy(css = "a[title='Spanish']")
	@CacheLookup
	private WebElement espaol;

	@FindBy(css = "a[title='Go to Facebook Home']")
	@CacheLookup
	private WebElement facebook;

	@FindBy(css = "a[title='Facebook Lite for Android.']")
	@CacheLookup
	private WebElement facebookLite;

	@FindBy(name = "sex")
	@CacheLookup
	private List<WebElement> female;

	private final String femaleValue = "1";

	@FindBy(css = "a[title='Find anyone on the web.']")
	@CacheLookup
	private WebElement findFriends;

	@FindBy(css = "a[href='https://www.facebook.com/recover/initiate?lwv=110']")
	@CacheLookup
	private WebElement forgotAccount;

	@FindBy(css = "a[title='French (France)']")
	@CacheLookup
	private WebElement franaisFrance;

	@FindBy(css = "a[title='Check out Facebook games.']")
	@CacheLookup
	private WebElement games;

	@FindBy(css = "a[title='Browse our Groups directory.']")
	@CacheLookup
	private WebElement groups;

	@FindBy(css = "a[title='Visit our Help Center.']")
	@CacheLookup
	private WebElement help;

	@FindBy(css = "a[title='Check out Instagram']")
	@CacheLookup
	private WebElement instagram;

	@FindBy(css = "a[title='Italian']")
	@CacheLookup
	private WebElement italiano;

	@FindBy(css = "a[title='Browse our places directory.']")
	@CacheLookup
	private WebElement locations;

	@FindBy(id = "u_0_r")
	@CacheLookup
	private WebElement logIn1;

	@FindBy(css = "a[title='Log into Facebook']")
	@CacheLookup
	private WebElement logIn2;

	@FindBy(id = "u_0_4")
	@CacheLookup
	private WebElement male1;

	@FindBy(id = "u_0_6")
	@CacheLookup
	private WebElement male2;

	@FindBy(id = "u_0_9")
	@CacheLookup
	private WebElement male3;

	@FindBy(id = "u_0_c")
	@CacheLookup
	private WebElement male4;

	@FindBy(id = "u_0_e")
	@CacheLookup
	private WebElement male5;

	@FindBy(id = "u_0_g")
	@CacheLookup
	private WebElement male6;

	@FindBy(name = "sex")
	@CacheLookup
	private List<WebElement> male7;

	@SuppressWarnings("unused")
	private final String maleValue = "2";

	@FindBy(css = "a[title='Browse our marketplace product directory.']")
	@CacheLookup
	private WebElement marketplace;

	@FindBy(css = "a[title='Check out Messenger.']")
	@CacheLookup
	private WebElement messenger;

	@FindBy(css = "a[title='Check out Facebook Mobile.']")
	@CacheLookup
	private WebElement mobile;

	@FindBy(css = "a[title='Check out Moments.']")
	@CacheLookup
	private WebElement moments;

	private final String pageLoadedText = "of what you're looking for with Facebook Search";

	private final String pageUrl = "/";

	@FindBy(css = "a[title='Browse our pages directory.']")
	@CacheLookup
	private WebElement pages;

	@FindBy(id = "pass")
	@CacheLookup
	private WebElement password;

	@FindBy(css = "a[title='Browse our people directory.']")
	@CacheLookup
	private WebElement people;

	@FindBy(css = "a[title='Check out popular places on Facebook.']")
	@CacheLookup
	private WebElement places;

	@FindBy(css = "a[title='Portuguese (Brazil)']")
	@CacheLookup
	private WebElement portugusBrasil;

	@FindBy(css = "a[title='Learn about your privacy and Facebook.']")
	@CacheLookup
	private WebElement privacy;

	@FindBy(css = "a[title='Browse our Recipes directory.']")
	@CacheLookup
	private WebElement recipes;

	@FindBy(css = "a[title='View and edit your Facebook settings.']")
	@CacheLookup
	private WebElement settings;

	@FindBy(id = "u_0_p")
	@CacheLookup
	private WebElement signUp1;

	@FindBy(css = "a[title='Sign Up for Facebook']")
	@CacheLookup
	private WebElement signUp2;

	@FindBy(id = "terms-link")
	@CacheLookup
	private WebElement terms1;

	@FindBy(css = "a[title='Review our terms and policies.']")
	@CacheLookup
	private WebElement terms2;

	@FindBy(id = "recaptcha_reload_btn")
	@CacheLookup
	private WebElement tryDifferentWords1;

	@FindBy(id = "recaptcha_reload_btn")
	@CacheLookup
	private WebElement tryDifferentWords2;

	@FindBy(css = "#captcha div:nth-of-type(7) a.mlm")
	@CacheLookup
	private WebElement whyAmISeeingThis;

	@FindBy(id = "month")
	@CacheLookup
	private WebElement whyDoINeedToProvide1;

	@FindBy(id = "day")
	@CacheLookup
	private WebElement whyDoINeedToProvide2;

	@FindBy(id = "year")
	@CacheLookup
	private WebElement whyDoINeedToProvide3;

	@FindBy(id = "birthday-help")
	@CacheLookup
	private WebElement whyDoINeedToProvide4;

	public Mercury() {
	}

	public Mercury(WebDriver driver) {
		this();
		this.driver = driver;
	}

	public Mercury(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public Mercury(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on About Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickAboutLink() {
		about.click();
		return this;
	}

	/**
	 * Click on Activity Log Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickActivityLogLink() {
		activityLog.click();
		return this;
	}

	/**
	 * Click on Ad Choices Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickAdChoicesLink() {
		adChoices.click();
		return this;
	}

	/**
	 * Click on An Audio Captcha Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickAnAudioCaptchaLink() {
		anAudioCaptcha.click();
		return this;
	}

	/**
	 * Click on Back Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickBackLink() {
		back.click();
		return this;
	}

	/**
	 * Click on Back To Text Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickBackToTextLink() {
		backToText.click();
		return this;
	}

	/**
	 * Click on Careers Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickCareersLink() {
		careers.click();
		return this;
	}

	/**
	 * Click on Celebrities Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickCelebritiesLink() {
		celebrities.click();
		return this;
	}

	/**
	 * Click on Cookie Use Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickCookieUseLink() {
		cookieUse.click();
		return this;
	}

	/**
	 * Click on Cookies Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickCookiesLink() {
		cookies.click();
		return this;
	}

	/**
	 * Click on Create A Page Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickCreateAPageLink() {
		createAPage.click();
		return this;
	}

	/**
	 * Click on Create Account Button.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickCreateAccountButton() {
		createAccount.click();
		return this;
	}

	/**
	 * Click on Create Ad Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickCreateAdLink() {
		createAd.click();
		return this;
	}

	/**
	 * Click on Create Page Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickCreatePageLink() {
		createPage.click();
		return this;
	}

	/**
	 * Click on Data Policy Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickDataPolicyLink() {
		dataPolicy.click();
		return this;
	}

	/**
	 * Click on Deutsch Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickDeutschLink() {
		deutsch.click();
		return this;
	}

	/**
	 * Click on Developers Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickDevelopersLink() {
		developers.click();
		return this;
	}

	/**
	 * Click on Espaol Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickEspaolLink() {
		espaol.click();
		return this;
	}

	/**
	 * Click on Facebook Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickFacebookLink() {
		facebook.click();
		return this;
	}

	/**
	 * Click on Facebook Lite Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickFacebookLiteLink() {
		facebookLite.click();
		return this;
	}

	/**
	 * Click on Find Friends Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickFindFriendsLink() {
		findFriends.click();
		return this;
	}

	/**
	 * Click on Forgot Account Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickForgotAccountLink() {
		forgotAccount.click();
		return this;
	}

	/**
	 * Click on Franais France Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickFranaisFranceLink() {
		franaisFrance.click();
		return this;
	}

	/**
	 * Click on Games Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickGamesLink() {
		games.click();
		return this;
	}

	/**
	 * Click on Groups Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickGroupsLink() {
		groups.click();
		return this;
	}

	/**
	 * Click on Help Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickHelpLink() {
		help.click();
		return this;
	}

	/**
	 * Click on Instagram Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickInstagramLink() {
		instagram.click();
		return this;
	}

	/**
	 * Click on Italiano Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickItalianoLink() {
		italiano.click();
		return this;
	}

	/**
	 * Click on Locations Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickLocationsLink() {
		locations.click();
		return this;
	}

	/**
	 * Click on Log In Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickLogIn1Link() {
		logIn1.click();
		return this;
	}

	/**
	 * Click on Log In Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickLogIn2Link() {
		logIn2.click();
		return this;
	}

	/**
	 * Click on Marketplace Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickMarketplaceLink() {
		marketplace.click();
		return this;
	}

	/**
	 * Click on Messenger Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickMessengerLink() {
		messenger.click();
		return this;
	}

	/**
	 * Click on Mobile Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickMobileLink() {
		mobile.click();
		return this;
	}

	/**
	 * Click on Moments Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickMomentsLink() {
		moments.click();
		return this;
	}

	/**
	 * Click on Pages Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickPagesLink() {
		pages.click();
		return this;
	}

	/**
	 * Click on People Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickPeopleLink() {
		people.click();
		return this;
	}

	/**
	 * Click on Places Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickPlacesLink() {
		places.click();
		return this;
	}

	/**
	 * Click on Portugus Brasil Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickPortugusBrasilLink() {
		portugusBrasil.click();
		return this;
	}

	/**
	 * Click on Privacy Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickPrivacyLink() {
		privacy.click();
		return this;
	}

	/**
	 * Click on Recipes Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickRecipesLink() {
		recipes.click();
		return this;
	}

	/**
	 * Click on Settings Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickSettingsLink() {
		settings.click();
		return this;
	}

	/**
	 * Click on Sign Up Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickSignUp1Link() {
		signUp1.click();
		return this;
	}

	/**
	 * Click on Sign Up Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickSignUp2Link() {
		signUp2.click();
		return this;
	}

	/**
	 * Click on Terms Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickTerms1Link() {
		terms1.click();
		return this;
	}

	/**
	 * Click on Terms Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickTerms2Link() {
		terms2.click();
		return this;
	}

	/**
	 * Click on Try Different Words Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickTryDifferentWords1Link() {
		tryDifferentWords1.click();
		return this;
	}

	/**
	 * Click on Try Different Words Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickTryDifferentWords2Link() {
		tryDifferentWords2.click();
		return this;
	}

	/**
	 * Click on Why Am I Seeing This Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickWhyAmISeeingThisLink() {
		whyAmISeeingThis.click();
		return this;
	}

	/**
	 * Click on Why Do I Need To Provide My Birthday Link.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury clickWhyDoINeedToProvide4Link() {
		whyDoINeedToProvide4.click();
		return this;
	}

	/**
	 * Fill every fields in the page.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury fill() {
		setEmailOrPhoneEmailField();
		setPasswordPasswordField();
		setMale1TextField();
		setMale2TextField();
		setMale3TextField();
		setMale4TextField();
		setMale5TextField();
		setMale6PasswordField();
		setWhyDoINeedToProvide1DropDownListField();
		setWhyDoINeedToProvide2DropDownListField();
		setWhyDoINeedToProvide3DropDownListField();
		setFemaleRadioButtonField();
		setMale7RadioButtonField();
		setEnterTheTextYouSeeAboveTextField();
		return this;
	}

	/**
	 * Fill every fields in the page and submit it to target page.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury fillAndSubmit() {
		fill();
		return submit();
	}

	/**
	 * Set default value to Email Or Phone Email field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setEmailOrPhoneEmailField() {
		return setEmailOrPhoneEmailField(data.get("EMAIL_OR_PHONE"));
	}

	/**
	 * Set value to Email Or Phone Email field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setEmailOrPhoneEmailField(String emailOrPhoneValue) {
		emailOrPhone.sendKeys(emailOrPhoneValue);
		return this;
	}

	/**
	 * Set default value to Enter The Text You See Above. Text field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setEnterTheTextYouSeeAboveTextField() {
		return setEnterTheTextYouSeeAboveTextField(data.get("ENTER_THE_TEXT_YOU_SEE_ABOVE"));
	}

	/**
	 * Set value to Enter The Text You See Above. Text field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setEnterTheTextYouSeeAboveTextField(String enterTheTextYouSeeAboveValue) {
		enterTheTextYouSeeAbove.sendKeys(enterTheTextYouSeeAboveValue);
		return this;
	}

	/**
	 * Set default value to Female Radio Button field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setFemaleRadioButtonField() {
		for (WebElement el : female) {
			if (el.getAttribute("value").equals(femaleValue)) {
				if (!el.isSelected()) {
					el.click();
				}
				break;
			}
		}
		return this;
	}

	/**
	 * Set default value to Male Text field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale1TextField() {
		return setMale1TextField(data.get("MALE_1"));
	}

	/**
	 * Set value to Male Text field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale1TextField(String male1Value) {
		male1.sendKeys(male1Value);
		return this;
	}

	/**
	 * Set default value to Male Text field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale2TextField() {
		return setMale2TextField(data.get("MALE_2"));
	}

	/**
	 * Set value to Male Text field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale2TextField(String male2Value) {
		male2.sendKeys(male2Value);
		return this;
	}

	/**
	 * Set default value to Male Text field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale3TextField() {
		return setMale3TextField(data.get("MALE_3"));
	}

	/**
	 * Set value to Male Text field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale3TextField(String male3Value) {
		male3.sendKeys(male3Value);
		return this;
	}

	/**
	 * Set default value to Male Text field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale4TextField() {
		return setMale4TextField(data.get("MALE_4"));
	}

	/**
	 * Set value to Male Text field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale4TextField(String male4Value) {
		male4.sendKeys(male4Value);
		return this;
	}

	/**
	 * Set default value to Male Text field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale5TextField() {
		return setMale5TextField(data.get("MALE_5"));
	}

	/**
	 * Set value to Male Text field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale5TextField(String male5Value) {
		male5.sendKeys(male5Value);
		return this;
	}

	/**
	 * Set default value to Male Password field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale6PasswordField() {
		return setMale6PasswordField(data.get("MALE_6"));
	}

	/**
	 * Set value to Male Password field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale6PasswordField(String male6Value) {
		male6.sendKeys(male6Value);
		return this;
	}

	/**
	 * Set default value to Male Radio Button field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setMale7RadioButtonField() {
		for (WebElement el : male7) {
			Object male7Value = null;
			if (el.getAttribute("value").equals(male7Value)) {
				if (!el.isSelected()) {
					el.click();
				}
				break;
			}
		}
		return this;
	}

	/**
	 * Set default value to Password Password field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setPasswordPasswordField() {
		return setPasswordPasswordField(data.get("PASSWORD"));
	}

	/**
	 * Set value to Password Password field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setPasswordPasswordField(String passwordValue) {
		password.sendKeys(passwordValue);
		return this;
	}

	/**
	 * Set default value to Why Do I Need To Provide My Birthday Drop Down List
	 * field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setWhyDoINeedToProvide1DropDownListField() {
		return setWhyDoINeedToProvide1DropDownListField(data.get("WHY_DO_I_NEED_TO_PROVIDE_1"));
	}

	/**
	 * Set value to Why Do I Need To Provide My Birthday Drop Down List field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setWhyDoINeedToProvide1DropDownListField(String whyDoINeedToProvide1Value) {
		new Select(whyDoINeedToProvide1).selectByVisibleText(whyDoINeedToProvide1Value);
		return this;
	}

	/**
	 * Set default value to Why Do I Need To Provide My Birthday Drop Down List
	 * field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setWhyDoINeedToProvide2DropDownListField() {
		return setWhyDoINeedToProvide2DropDownListField(data.get("WHY_DO_I_NEED_TO_PROVIDE_2"));
	}

	/**
	 * Set value to Why Do I Need To Provide My Birthday Drop Down List field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setWhyDoINeedToProvide2DropDownListField(String whyDoINeedToProvide2Value) {
		new Select(whyDoINeedToProvide2).selectByVisibleText(whyDoINeedToProvide2Value);
		return this;
	}

	/**
	 * Set default value to Why Do I Need To Provide My Birthday Drop Down List
	 * field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setWhyDoINeedToProvide3DropDownListField() {
		return setWhyDoINeedToProvide3DropDownListField(data.get("WHY_DO_I_NEED_TO_PROVIDE_3"));
	}

	/**
	 * Set value to Why Do I Need To Provide My Birthday Drop Down List field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury setWhyDoINeedToProvide3DropDownListField(String whyDoINeedToProvide3Value) {
		new Select(whyDoINeedToProvide3).selectByVisibleText(whyDoINeedToProvide3Value);
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury submit() {
		clickLogIn1Link();
		return this;
	}

	/**
	 * Unset default value from Why Do I Need To Provide My Birthday Drop Down List
	 * field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury unsetWhyDoINeedToProvide1DropDownListField() {
		return unsetWhyDoINeedToProvide1DropDownListField(data.get("WHY_DO_I_NEED_TO_PROVIDE_1"));
	}

	/**
	 * Unset value from Why Do I Need To Provide My Birthday Drop Down List field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury unsetWhyDoINeedToProvide1DropDownListField(String whyDoINeedToProvide1Value) {
		new Select(whyDoINeedToProvide1).deselectByVisibleText(whyDoINeedToProvide1Value);
		return this;
	}

	/**
	 * Unset default value from Why Do I Need To Provide My Birthday Drop Down List
	 * field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury unsetWhyDoINeedToProvide2DropDownListField() {
		return unsetWhyDoINeedToProvide2DropDownListField(data.get("WHY_DO_I_NEED_TO_PROVIDE_2"));
	}

	/**
	 * Unset value from Why Do I Need To Provide My Birthday Drop Down List field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury unsetWhyDoINeedToProvide2DropDownListField(String whyDoINeedToProvide2Value) {
		new Select(whyDoINeedToProvide2).deselectByVisibleText(whyDoINeedToProvide2Value);
		return this;
	}

	/**
	 * Unset default value from Why Do I Need To Provide My Birthday Drop Down List
	 * field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury unsetWhyDoINeedToProvide3DropDownListField() {
		return unsetWhyDoINeedToProvide3DropDownListField(data.get("WHY_DO_I_NEED_TO_PROVIDE_3"));
	}

	/**
	 * Unset value from Why Do I Need To Provide My Birthday Drop Down List field.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury unsetWhyDoINeedToProvide3DropDownListField(String whyDoINeedToProvide3Value) {
		new Select(whyDoINeedToProvide3).deselectByVisibleText(whyDoINeedToProvide3Value);
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury verifyPageLoaded() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getPageSource().contains(pageLoadedText);
			}
		});
		return this;
	}

	/**
	 * Verify that current page URL matches the expected URL.
	 *
	 * @return the Mercury class instance.
	 */
	public Mercury verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}
}