package io.github.bruxo.form;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {
    private static final long serialVersionUID = 1L;
 
    private String dispatch;
    private String name;
    private Integer age;
 
    public void reset() {
        this.name = null;
        this.age = null;
    }
 
    public String getDispatch() {
        return dispatch;
    }
 
    public void setDispatch(String dispatch) {
        this.dispatch = dispatch;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
}
