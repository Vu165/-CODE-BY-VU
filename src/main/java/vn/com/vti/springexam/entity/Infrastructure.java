package vn.com.vti.springexam.entity;

import java.util.Date;

public class Infrastructure {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column infrastructure.id
     *
     * @mbg.generated Wed Sep 21 21:02:47 JST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column infrastructure.name
     *
     * @mbg.generated Wed Sep 21 21:02:47 JST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column infrastructure.regist_date
     *
     * @mbg.generated Wed Sep 21 21:02:47 JST 2022
     */
    private Date registDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column infrastructure.id
     *
     * @return the value of infrastructure.id
     *
     * @mbg.generated Wed Sep 21 21:02:47 JST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column infrastructure.id
     *
     * @param id the value for infrastructure.id
     *
     * @mbg.generated Wed Sep 21 21:02:47 JST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column infrastructure.name
     *
     * @return the value of infrastructure.name
     *
     * @mbg.generated Wed Sep 21 21:02:47 JST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column infrastructure.name
     *
     * @param name the value for infrastructure.name
     *
     * @mbg.generated Wed Sep 21 21:02:47 JST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column infrastructure.regist_date
     *
     * @return the value of infrastructure.regist_date
     *
     * @mbg.generated Wed Sep 21 21:02:47 JST 2022
     */
    public Date getRegistDate() {
        return registDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column infrastructure.regist_date
     *
     * @param registDate the value for infrastructure.regist_date
     *
     * @mbg.generated Wed Sep 21 21:02:47 JST 2022
     */
    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }
}