package pl.alburnus.mybatis.generator.entity;

public class TeamMate {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teammate.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teammate.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teammate.team_id
     *
     * @mbg.generated
     */
    private Long teamId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teammate.id
     *
     * @return the value of teammate.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teammate.id
     *
     * @param id the value for teammate.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teammate.name
     *
     * @return the value of teammate.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teammate.name
     *
     * @param name the value for teammate.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teammate.team_id
     *
     * @return the value of teammate.team_id
     *
     * @mbg.generated
     */
    public Long getTeamId() {
        return teamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teammate.team_id
     *
     * @param teamId the value for teammate.team_id
     *
     * @mbg.generated
     */
    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}