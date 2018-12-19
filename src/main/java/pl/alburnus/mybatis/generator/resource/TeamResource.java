package pl.alburnus.mybatis.generator.resource;

import org.springframework.web.bind.annotation.*;
import pl.alburnus.mybatis.generator.entity.Team;
import pl.alburnus.mybatis.generator.entity.TeamExample;
import pl.alburnus.mybatis.generator.entity.TeamMate;
import pl.alburnus.mybatis.generator.entity.TeamMateExample;
import pl.alburnus.mybatis.generator.mapper.TeamMapper;
import pl.alburnus.mybatis.generator.mapper.TeamMateMapper;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TeamResource {

    private final TeamMapper teamMapper;

    private final TeamMateMapper teammateMapper;

    public TeamResource(TeamMapper teamMapper, TeamMateMapper teammateMapper) {
        this.teamMapper = teamMapper;
        this.teammateMapper = teammateMapper;
    }

    @GetMapping("/team")
    public List<Team> getAllTeam() {
        return teamMapper.selectByExample(new TeamExample());
    }

    @PostMapping("/team")
    public void createTeam(@RequestBody Team team) {
        teamMapper.insert(team);
    }

    @GetMapping("/teammate")
    public List<TeamMate> getAllTeammate() {
        return teammateMapper.selectByExample(new TeamMateExample());
    }

}
