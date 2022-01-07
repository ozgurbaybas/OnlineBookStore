package ozgurbaybas.OnlineBookStore.service;

import ozgurbaybas.OnlineBookStore.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
