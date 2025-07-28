package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: th  reason: default package */
public final class th extends v2 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ th(aec aec, int i) {
        super(aec);
        this.o = i;
    }

    public final String g() {
        switch (this.o) {
            case 0:
                return "DELETE FROM animoji";
            case 1:
                return "DELETE FROM animoji_set";
            case 2:
                return "DELETE FROM call_links WHERE conversation_id=?";
            case 3:
                return "DELETE FROM call_links";
            case 4:
                return "DELETE FROM chats WHERE id = ?";
            case 5:
                return "DELETE FROM chats";
            case 6:
                return "INSERT OR REPLACE INTO chat_title (docid, normalizedTitle, originalTitle, normalizedTitleWithoutEmoji, originalTitleWithoutEmoji, sortTime) VALUES(?, ?, ?, ?, ?, ?)";
            case 7:
                return "DELETE FROM chat_title WHERE docid=?";
            case 8:
                return "DELETE FROM chat_title";
            case 9:
                return "UPDATE contacts SET server_id = ?, data = ? WHERE id = ?";
            case 10:
                return "UPDATE contacts SET presence = ?, presence_type = ? WHERE server_id = ?";
            case 11:
                return "DELETE FROM contacts";
            case Protos.Attaches.Attach.PRESENT:
                return "INSERT OR REPLACE INTO contact_title (docid, link, allNormalizedTitles, allOriginalTitles, allNormalizedTitlesWithoutEmoji, allOriginalTitlesWithoutEmoji) VALUES(?, ?, ?, ?, ?, ?)";
            case 13:
                return "DELETE FROM contact_title WHERE docid=?";
            case Protos.Attaches.Attach.LOCATION:
                return "DELETE FROM contact_title";
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return "DELETE FROM default_emoji";
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return "DELETE FROM draft_uploads WHERE chat_id=? AND attach_id=?";
            case LangUtils.HASH_SEED:
                return "DELETE FROM draft_uploads";
            case 18:
                return "DELETE FROM favorite_sticker_sets";
            case 19:
                return "DELETE FROM favorite_stickers";
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return "DELETE FROM fcm_notifications_analytics";
            case 21:
                return "DELETE FROM fcm_notifications_analytics WHERE analytics_status=? AND chat_id=? AND time<=?";
            case 22:
                return "DELETE FROM fcm_notifications_analytics WHERE received_time<=?";
            case 23:
                return "DELETE FROM fcm_notifications_history";
            case 24:
                return "DELETE FROM message_uploads WHERE message_id=? AND chat_id=? AND attach_id=?";
            case 25:
                return "DELETE FROM message_uploads";
            case 26:
                return "UPDATE messages SET localized_error = ? WHERE id = ?";
            case 27:
                return "UPDATE messages SET update_time = ? WHERE id = ?";
            case 28:
                return "UPDATE messages SET status = ? WHERE chat_id = ? AND time <= ?";
            default:
                return "UPDATE messages SET status = ? WHERE chat_id = ? AND time >= ? AND time <= ?";
        }
    }
}
