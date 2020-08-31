package com.library.book.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
  @Id
  @Column(name = "bookid")
  private String bookid;
  @Column(name = "bookname")
  private String bookname;
  @Column(name = "author")
  private String author;
  @Column(name = "availablecopies")
  private int availablecopies;
  @Column(name = "totalcopies")
  private int totalcopies;

@Override
  public String toString() {
    return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", availablecopies="
        + availablecopies + ", totalcopies=" + totalcopies + "]";
  }

  public Book(String bookid, String bookname, String author, String availablecopies, int totalcopies) {
    super();
    bookid = bookid;
    this.bookname = bookname;
    this.author = author;
    this.availablecopies = availablecopies;
    this.totalcopies = totalcopies;
  }

  public String getbookid() {
    return bookid;
  }

  public void setbookid(String bookid) {
    bookid = bookid;
  }

  public String getbookname() {
    return bookname;
  }

  public void setbookname(String bookname) {
    this.bookname = bookname;
  }

  public String getauthor() {
    return author;
  }

  public void setauthor(String author) {
    this.author = author;
  }

  public String getavailablecopies() {
    return availablecopies;
  }

  public void setavailablecopies(String availablecopies) {
    this.availablecopies = availablecopies;
  }

  public int gettotalcopies() {
    return totalcopies;
  }

  public void settotalcopies(int totalcopies) {
    this.totalcopies = totalcopies;
  }


  public Book() {
    super();
  }

}
