/** This class is expected to be immutable. Please make necessary changes. */
package com.apptware.interview.immutability;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Student {
  private String name;
  private Date dateOfBirth;
  private List<String> courses;

  public List<String> getCourses(){
    return new ArrayList(courses);
  }

  public Date getDateOfBirth(){
    return (Date) dateOfBirth.clone();
  }
}