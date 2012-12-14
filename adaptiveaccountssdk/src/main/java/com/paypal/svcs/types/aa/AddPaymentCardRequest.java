package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.aa.NameType;
import com.paypal.svcs.types.aa.AddressType;
import com.paypal.svcs.types.aa.CardTypeType;
import com.paypal.svcs.types.aa.CardDateType;
import com.paypal.svcs.types.aa.ConfirmationType;
import com.paypal.svcs.types.aa.WebOptionsType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * Identifying the PayPal account to which this request is
 * targetted to. Caller of this API has to either provided an
 * emailAddress or an accountId. 
 */
public class AddPaymentCardRequest{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * Identifying the PayPal account to which this request is
	 * targetted to. Caller of this API has to either provided an
	 * emailAddress or an accountId. 	 
	 */ 
	private String emailAddress;

	/**
	 * Identifying the PayPal account to which this request is
	 * targetted to. Caller of this API has to either provided an
	 * emailAddress or an accountId. 	 
	 */ 
	private String accountId;

	/**
	 * 	 
	 */ 
	private String createAccountKey;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private NameType nameOnCard;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private AddressType billingAddress;

	/**
	 * 	 
	 */ 
	private String cardOwnerDateOfBirth;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String cardNumber;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private CardTypeType cardType;

	/**
	 * 	 
	 */ 
	private CardDateType expirationDate;

	/**
	 * CVV2: Proivde only for requests where confirmationType is
	 * None (Direct request) 	 
	 */ 
	private String cardVerificationNumber;

	/**
	 * 	 
	 */ 
	private CardDateType startDate;

	/**
	 * Up to 2 digit for Switch/Maestro cards. 	 
	 */ 
	private String issueNumber;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private ConfirmationType confirmationType;

	/**
	 * 	 
	 */ 
	private WebOptionsType webOptions;

	

	/**
	 * Constructor with arguments
	 */
	public AddPaymentCardRequest (RequestEnvelope requestEnvelope, NameType nameOnCard, AddressType billingAddress, String cardNumber, CardTypeType cardType, ConfirmationType confirmationType){
		this.requestEnvelope = requestEnvelope;
		this.nameOnCard = nameOnCard;
		this.billingAddress = billingAddress;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.confirmationType = confirmationType;
	}	

	/**
	 * Default Constructor
	 */
	public AddPaymentCardRequest (){
	}	

	/**
	 * Getter for requestEnvelope
	 */
	 public RequestEnvelope getRequestEnvelope() {
	 	return requestEnvelope;
	 }
	 
	/**
	 * Setter for requestEnvelope
	 */
	 public void setRequestEnvelope(RequestEnvelope requestEnvelope) {
	 	this.requestEnvelope = requestEnvelope;
	 }
	 
	/**
	 * Getter for emailAddress
	 */
	 public String getEmailAddress() {
	 	return emailAddress;
	 }
	 
	/**
	 * Setter for emailAddress
	 */
	 public void setEmailAddress(String emailAddress) {
	 	this.emailAddress = emailAddress;
	 }
	 
	/**
	 * Getter for accountId
	 */
	 public String getAccountId() {
	 	return accountId;
	 }
	 
	/**
	 * Setter for accountId
	 */
	 public void setAccountId(String accountId) {
	 	this.accountId = accountId;
	 }
	 
	/**
	 * Getter for createAccountKey
	 */
	 public String getCreateAccountKey() {
	 	return createAccountKey;
	 }
	 
	/**
	 * Setter for createAccountKey
	 */
	 public void setCreateAccountKey(String createAccountKey) {
	 	this.createAccountKey = createAccountKey;
	 }
	 
	/**
	 * Getter for nameOnCard
	 */
	 public NameType getNameOnCard() {
	 	return nameOnCard;
	 }
	 
	/**
	 * Setter for nameOnCard
	 */
	 public void setNameOnCard(NameType nameOnCard) {
	 	this.nameOnCard = nameOnCard;
	 }
	 
	/**
	 * Getter for billingAddress
	 */
	 public AddressType getBillingAddress() {
	 	return billingAddress;
	 }
	 
	/**
	 * Setter for billingAddress
	 */
	 public void setBillingAddress(AddressType billingAddress) {
	 	this.billingAddress = billingAddress;
	 }
	 
	/**
	 * Getter for cardOwnerDateOfBirth
	 */
	 public String getCardOwnerDateOfBirth() {
	 	return cardOwnerDateOfBirth;
	 }
	 
	/**
	 * Setter for cardOwnerDateOfBirth
	 */
	 public void setCardOwnerDateOfBirth(String cardOwnerDateOfBirth) {
	 	this.cardOwnerDateOfBirth = cardOwnerDateOfBirth;
	 }
	 
	/**
	 * Getter for cardNumber
	 */
	 public String getCardNumber() {
	 	return cardNumber;
	 }
	 
	/**
	 * Setter for cardNumber
	 */
	 public void setCardNumber(String cardNumber) {
	 	this.cardNumber = cardNumber;
	 }
	 
	/**
	 * Getter for cardType
	 */
	 public CardTypeType getCardType() {
	 	return cardType;
	 }
	 
	/**
	 * Setter for cardType
	 */
	 public void setCardType(CardTypeType cardType) {
	 	this.cardType = cardType;
	 }
	 
	/**
	 * Getter for expirationDate
	 */
	 public CardDateType getExpirationDate() {
	 	return expirationDate;
	 }
	 
	/**
	 * Setter for expirationDate
	 */
	 public void setExpirationDate(CardDateType expirationDate) {
	 	this.expirationDate = expirationDate;
	 }
	 
	/**
	 * Getter for cardVerificationNumber
	 */
	 public String getCardVerificationNumber() {
	 	return cardVerificationNumber;
	 }
	 
	/**
	 * Setter for cardVerificationNumber
	 */
	 public void setCardVerificationNumber(String cardVerificationNumber) {
	 	this.cardVerificationNumber = cardVerificationNumber;
	 }
	 
	/**
	 * Getter for startDate
	 */
	 public CardDateType getStartDate() {
	 	return startDate;
	 }
	 
	/**
	 * Setter for startDate
	 */
	 public void setStartDate(CardDateType startDate) {
	 	this.startDate = startDate;
	 }
	 
	/**
	 * Getter for issueNumber
	 */
	 public String getIssueNumber() {
	 	return issueNumber;
	 }
	 
	/**
	 * Setter for issueNumber
	 */
	 public void setIssueNumber(String issueNumber) {
	 	this.issueNumber = issueNumber;
	 }
	 
	/**
	 * Getter for confirmationType
	 */
	 public ConfirmationType getConfirmationType() {
	 	return confirmationType;
	 }
	 
	/**
	 * Setter for confirmationType
	 */
	 public void setConfirmationType(ConfirmationType confirmationType) {
	 	this.confirmationType = confirmationType;
	 }
	 
	/**
	 * Getter for webOptions
	 */
	 public WebOptionsType getWebOptions() {
	 	return webOptions;
	 }
	 
	/**
	 * Setter for webOptions
	 */
	 public void setWebOptions(WebOptionsType webOptions) {
	 	this.webOptions = webOptions;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(this.requestEnvelope.toNVPString(newPrefix));
		}
		if (this.emailAddress != null) {
			sb.append(prefix).append("emailAddress=").append(NVPUtil.encodeUrl(this.emailAddress));
			sb.append("&");
		}
		if (this.accountId != null) {
			sb.append(prefix).append("accountId=").append(NVPUtil.encodeUrl(this.accountId));
			sb.append("&");
		}
		if (this.createAccountKey != null) {
			sb.append(prefix).append("createAccountKey=").append(NVPUtil.encodeUrl(this.createAccountKey));
			sb.append("&");
		}
		if (this.nameOnCard != null) {
			String newPrefix = prefix + "nameOnCard.";
			sb.append(this.nameOnCard.toNVPString(newPrefix));
		}
		if (this.billingAddress != null) {
			String newPrefix = prefix + "billingAddress.";
			sb.append(this.billingAddress.toNVPString(newPrefix));
		}
		if (this.cardOwnerDateOfBirth != null) {
			sb.append(prefix).append("cardOwnerDateOfBirth=").append(NVPUtil.encodeUrl(this.cardOwnerDateOfBirth));
			sb.append("&");
		}
		if (this.cardNumber != null) {
			sb.append(prefix).append("cardNumber=").append(NVPUtil.encodeUrl(this.cardNumber));
			sb.append("&");
		}
		if (this.cardType != null) {
			sb.append(prefix).append("cardType=").append(this.cardType.getValue());
			sb.append("&");
		}
		if (this.expirationDate != null) {
			String newPrefix = prefix + "expirationDate.";
			sb.append(this.expirationDate.toNVPString(newPrefix));
		}
		if (this.cardVerificationNumber != null) {
			sb.append(prefix).append("cardVerificationNumber=").append(NVPUtil.encodeUrl(this.cardVerificationNumber));
			sb.append("&");
		}
		if (this.startDate != null) {
			String newPrefix = prefix + "startDate.";
			sb.append(this.startDate.toNVPString(newPrefix));
		}
		if (this.issueNumber != null) {
			sb.append(prefix).append("issueNumber=").append(NVPUtil.encodeUrl(this.issueNumber));
			sb.append("&");
		}
		if (this.confirmationType != null) {
			sb.append(prefix).append("confirmationType=").append(this.confirmationType.getValue());
			sb.append("&");
		}
		if (this.webOptions != null) {
			String newPrefix = prefix + "webOptions.";
			sb.append(this.webOptions.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}