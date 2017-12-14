package guru.springframework.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedHashMap;

@Document
public class User {

    @Id
    private ObjectId _id;
    private String firstName;
    private String lastName;
    LinkedHashMap<String, Long> wallets;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedHashMap<String, Long> getWallets() {
        return wallets;
    }

    public void setWallets(LinkedHashMap<String, Long> wallets) {
        this.wallets = wallets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (_id != null ? !_id.equals(user._id) : user._id != null) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        return wallets != null ? wallets.equals(user.wallets) : user.wallets == null;
    }

    @Override
    public int hashCode() {
        int result = _id != null ? _id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (wallets != null ? wallets.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "_id=" + _id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", wallets=" + wallets +
                '}';
    }
}
