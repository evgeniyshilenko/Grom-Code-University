package com.gromcode.lesson9.homeWork;

public class UserRepository {

    private User user[];

    public UserRepository(User user[]) {
        this.user = user;

    }

    public String[] getUserName() {
        String[] userNames = new String[ getSizeOfTheArray(user) ];
        int index = 0;
        for (int i = 0; i < user.length; i++) {
            if (user[ i ] != null) {
                userNames[ index ] = user[ i ].getName();
            }
        }
        return userNames;
    }

    public long[] getUserIds() {
        long[] userIds = new long[ getSizeOfTheArray(user) ];
        int index = 0;
        for (int i = 0; i < user.length; i++) {
            if (user[ i ] != null) {
                userIds[ index ] = user[ i ].getId();
            }
        }
        return userIds;
    }

    public String getUserNameById(long id)   {
        String userNameById = null;
        for (User us : user)
            if (us.getId()==id) {
                userNameById = us.getName();
            }
        return userNameById;
    }

    private int getSizeOfTheArray(User user[]) {
        int counter = 0;
        for (int i = 0; i < user.length; i++) {
            if (user[ i ] != null)
                counter++;
        }
        return counter;
    }

    public String getUserByName(String name) {
        String userByName = null;
        for (User us : user) {
            if (us.getName().equals(name) && userByName != us.getName()) {
                userByName = us.getName();
            }
        }
        return userByName;
    }

    public String getUserById(long id) {
        String userBynName = null;
        for (User us : user) {
            if (us.getId()==id && userBynName != us.getName()) {
                userBynName = us.getName();
                break;
            }
        }
        return userBynName;
    }

    public String getUserBySessionId(String sessionId) {
        String userBySessionId = null;
        for (User us : user) {
            if (us.getSessionId() == sessionId && userBySessionId != us.getName()) {
                userBySessionId = us.getSessionId();
            }
        }
        return userBySessionId;
    }
}
