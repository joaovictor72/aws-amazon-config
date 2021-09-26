package awsamazonconfig.perfil;

import awsamazonconfig.fakedatabase.FakeDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    private final FakeDataBase fakeDataBase;

    @Autowired
    public UserProfileDataAccessService(FakeDataBase fakeDataBase) {
        this.fakeDataBase = fakeDataBase;
    }

    List<UserProfile> getUserProfiles() {
        return fakeDataBase.getUserProfiles();
    }
}