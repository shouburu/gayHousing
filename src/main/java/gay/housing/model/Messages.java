package gay.housing.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "messages")
public class Messages {

    @EmbeddedId
    MessagesPK id;

    @Column(name = "message")
    private String message;

    public Messages() {}

    public Messages(MessagesPK id, String message) {
        this.id = id;
        this.message = message;
    }

    public MessagesPK getId() {
        return id;
    }

    public void setId(MessagesPK id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }

    @Embeddable
    class MessagesPK implements Serializable {

        @Column(name = "send_to")
        private Integer send_to;

        @Column(name = "send_from")
        private Integer send_from;

        @Column(name = "sent_at")
        private Timestamp sent_at;

        public MessagesPK() {}

        public MessagesPK(Integer send_to, Integer send_from, Timestamp sent_at) {
            this.send_to = send_to;
            this.send_from = send_from;
            this.sent_at = sent_at;
        }

        public Integer getSend_to() {
            return send_to;
        }

        public void setSend_to(Integer send_to) {
            this.send_to = send_to;
        }

        public Integer getSend_from() {
            return send_from;
        }

        public void setSend_from(Integer send_from) {
            this.send_from = send_from;
        }

        public Timestamp getSent_at() {
            return sent_at;
        }

        public void setSent_at(Timestamp sent_at) {
            this.sent_at = sent_at;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof MessagesPK)) return false;
            MessagesPK that = (MessagesPK) o;
            return Objects.equals(send_to, that.send_to) &&
                    Objects.equals(send_from, that.send_from) &&
                    Objects.equals(sent_at, that.sent_at);
        }

        @Override
        public int hashCode() {

            return Objects.hash(send_to, send_from, sent_at);
        }

        @Override
        public String toString() {
            return "MessagesPK{" +
                    "send_to=" + send_to +
                    ", send_from=" + send_from +
                    ", sent_at=" + sent_at +
                    '}';
        }
    }
}
