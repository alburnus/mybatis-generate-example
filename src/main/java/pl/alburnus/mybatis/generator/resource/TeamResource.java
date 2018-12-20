package pl.alburnus.mybatis.generator.resource;

import org.springframework.web.bind.annotation.*;
import pl.alburnus.mybatis.generator.entity.Team;
import pl.alburnus.mybatis.generator.entity.TeamExample;
import pl.alburnus.mybatis.generator.entity.Teammate;
import pl.alburnus.mybatis.generator.entity.TeammateExample;
import pl.alburnus.mybatis.generator.mapper.TeamMapper;
import pl.alburnus.mybatis.generator.mapper.TeammateMapper;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TeamResource {

    private final TeamMapper teamMapper;

    private final TeammateMapper teammateMapper;

    public TeamResource(TeamMapper teamMapper, TeammateMapper teammateMapper) {
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
    public List<Teammate> getAllTeammate() {
        return teammateMapper.selectByExample(new TeammateExample());
    }

    @PostMapping("/teammate")
    public void createTeammate(@RequestBody Teammate teamMate) {
        teammateMapper.insert(teamMate);
    }

}
