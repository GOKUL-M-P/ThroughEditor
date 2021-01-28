package com.cg.bank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CardDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cardId;
	@Column(name="CreditCard")
	private long debit;
	@Column(name="DebitCard")
	private long credit;
	@OneToOne(targetEntity =BankCustomer.class,cascade=CascadeType.ALL)
	@JoinColumn(name="CustomerId")
	private BankCustomer bankCustomer;
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public long getDebit() {
		return debit;
	}
	public void setDebit(long debit) {
		this.debit = debit;
	}
	public long getCredit() {
		return credit;
	}
	public void setCredit(long credit) {
		this.credit = credit;
	}
	public BankCustomer getBankCustomer() {
		return bankCustomer;
	}
	public void setBankCustomer(BankCustomer bankCustomer) {
		this.bankCustomer = bankCustomer;
	}
	
	

}
