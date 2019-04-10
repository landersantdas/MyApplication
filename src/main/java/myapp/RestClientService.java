package myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//set up the class as a service
@Service
public class RestClientService {

    private final RestTemplate restTemplate;

    //web service resource endpoints
    private final String GET_URL = "http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json";
 
    @Autowired
    public RestClientService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    
    //get all profiles then return a List of it
    public List<Profile> findAllProfile(){
        return Arrays.stream(restTemplate.getForObject(GET_URL, Profile[].class)).collect(Collectors.toList());
    }

    //get all profiles 
    //then return the profile with the same id
    public Profile findProfileById(String id){
        List<Profile> profiles = Arrays.stream(restTemplate.getForObject(GET_URL, Profile[].class)).collect(Collectors.toList());
        Profile specificProfile = new Profile();

        for (Profile profile: profiles){
            if ((profile.getId()).equals(id)){
                specificProfile = profile;
            }
        }
        return specificProfile;
    }
}
