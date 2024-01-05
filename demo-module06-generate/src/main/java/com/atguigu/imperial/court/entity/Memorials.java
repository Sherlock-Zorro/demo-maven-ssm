package com.atguigu.imperial.court.entity;

public class Memorials {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_memorials.memorials_id
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    private Integer memorialsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_memorials.memorials_title
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    private String memorialsTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_memorials.memorials_content
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    private String memorialsContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_memorials.memorials_emp
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    private Integer memorialsEmp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_memorials.memorials_create_time
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    private String memorialsCreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_memorials.feedback_time
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    private String feedbackTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_memorials.feedback_content
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    private String feedbackContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_memorials.memorials_status
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    private Integer memorialsStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_memorials.memorials_id
     *
     * @return the value of t_memorials.memorials_id
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public Integer getMemorialsId() {
        return memorialsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_memorials.memorials_id
     *
     * @param memorialsId the value for t_memorials.memorials_id
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public void setMemorialsId(Integer memorialsId) {
        this.memorialsId = memorialsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_memorials.memorials_title
     *
     * @return the value of t_memorials.memorials_title
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public String getMemorialsTitle() {
        return memorialsTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_memorials.memorials_title
     *
     * @param memorialsTitle the value for t_memorials.memorials_title
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public void setMemorialsTitle(String memorialsTitle) {
        this.memorialsTitle = memorialsTitle == null ? null : memorialsTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_memorials.memorials_content
     *
     * @return the value of t_memorials.memorials_content
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public String getMemorialsContent() {
        return memorialsContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_memorials.memorials_content
     *
     * @param memorialsContent the value for t_memorials.memorials_content
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public void setMemorialsContent(String memorialsContent) {
        this.memorialsContent = memorialsContent == null ? null : memorialsContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_memorials.memorials_emp
     *
     * @return the value of t_memorials.memorials_emp
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public Integer getMemorialsEmp() {
        return memorialsEmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_memorials.memorials_emp
     *
     * @param memorialsEmp the value for t_memorials.memorials_emp
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public void setMemorialsEmp(Integer memorialsEmp) {
        this.memorialsEmp = memorialsEmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_memorials.memorials_create_time
     *
     * @return the value of t_memorials.memorials_create_time
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public String getMemorialsCreateTime() {
        return memorialsCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_memorials.memorials_create_time
     *
     * @param memorialsCreateTime the value for t_memorials.memorials_create_time
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public void setMemorialsCreateTime(String memorialsCreateTime) {
        this.memorialsCreateTime = memorialsCreateTime == null ? null : memorialsCreateTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_memorials.feedback_time
     *
     * @return the value of t_memorials.feedback_time
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public String getFeedbackTime() {
        return feedbackTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_memorials.feedback_time
     *
     * @param feedbackTime the value for t_memorials.feedback_time
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public void setFeedbackTime(String feedbackTime) {
        this.feedbackTime = feedbackTime == null ? null : feedbackTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_memorials.feedback_content
     *
     * @return the value of t_memorials.feedback_content
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public String getFeedbackContent() {
        return feedbackContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_memorials.feedback_content
     *
     * @param feedbackContent the value for t_memorials.feedback_content
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent == null ? null : feedbackContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_memorials.memorials_status
     *
     * @return the value of t_memorials.memorials_status
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public Integer getMemorialsStatus() {
        return memorialsStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_memorials.memorials_status
     *
     * @param memorialsStatus the value for t_memorials.memorials_status
     *
     * @mbg.generated Tue Jan 02 15:58:59 CST 2024
     */
    public void setMemorialsStatus(Integer memorialsStatus) {
        this.memorialsStatus = memorialsStatus;
    }
}