package com.gromcode.lesson9.homeWork;

public class UserRepository {

    private User user[];

    public UserRepository(User user[]) {
        this.user = user;

    }

    public String[] getUserName() {
        String[] userName = new String[ getSizeOfTheArray(user) ];
        int index = 0;
        for (int i = 0; i < userName.length; i++) {
            if (user[ i ] != null)
                userName[ index ] = user[ i ].getName();
        }
        return userName;
    }

    public long[] getUserIds() {
        long[] userId = new long[ getSizeOfTheArray(user) ];
        int index = 0;
        for (int i = 0; i < userId.length; i++) {
            if ((user[ i ] != null))
                userId[ index ] = user[ i ].getId();
        }
        return userId;
    }

    public String getUserNameById(long id) {
        String userNameById = null;
        for (int i = 0; i < getSizeOfTheArray(user); i++) {
            if (user[ i ].getId() == id) {
                userNameById = user[ i ].getName();
            }
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
}
