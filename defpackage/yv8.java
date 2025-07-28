package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: yv8  reason: default package */
public final class yv8 extends v2 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv8(aec aec, int i) {
        super(aec);
        this.o = i;
    }

    public final String g() {
        switch (this.o) {
            case 0:
                return "UPDATE messages SET channel_views = ? AND channel_forwards = ? WHERE server_id = ?";
            case 1:
                return "UPDATE messages SET reactions = ? WHERE server_id = ?";
            case 2:
                return "UPDATE messages SET delayed_attrs_time_to_fire = ? AND delayed_attrs_notify_sender = ? WHERE id = ?";
            case 3:
                return "DELETE FROM messages WHERE chat_id = ?";
            case 4:
                return "DELETE FROM messages";
            case 5:
                return "DELETE FROM messages WHERE chat_id = ? AND time <= ? AND inserted_from_msg_link = 0 AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL";
            case 6:
                return "DELETE FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL";
            case 7:
                return "DELETE FROM messages WHERE chat_id = ? AND server_id = 0 AND time_local >= ? AND time_local <= ?";
            case 8:
                return "DELETE FROM messages WHERE media_type = ?";
            case 9:
                return "UPDATE messages SET delivery_status = ? WHERE id = ?";
            case 10:
                return "UPDATE messages SET error = ? WHERE id = ?";
            case 11:
                return "DELETE FROM fcm_notifications WHERE time <= ?";
            case Protos.Attaches.Attach.PRESENT:
                return "DELETE FROM fcm_notifications WHERE time <= ? AND chat_id = ?";
            case 13:
                return "DELETE FROM fcm_notifications";
            case Protos.Attaches.Attach.LOCATION:
                return "DELETE FROM fcm_notifications WHERE chat_id = ?";
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return "DELETE FROM notifications_read_marks";
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return "DELETE FROM notifications_tracker_messages WHERE time<=?";
            case LangUtils.HASH_SEED:
                return "DELETE FROM notifications_tracker_messages";
            case 18:
                return "UPDATE phones SET server_phone = ?, type = ? WHERE phone = ?";
            case 19:
                return "DELETE FROM phones";
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return "DELETE FROM phones WHERE id = ?";
            case 21:
                return "DELETE FROM reactions_section";
            case 22:
                return "DELETE FROM recent";
            case 23:
                return "DELETE FROM folder_and_chats WHERE folderId = ? AND chatId = ?";
            case 24:
                return "UPDATE chat_folder SET title = ?, emoji = ? WHERE id = ?";
            case 25:
                return "UPDATE chat_folder SET hideIfEmpty = ? WHERE id = ?";
            case 26:
                return "DELETE FROM folder_and_chats WHERE chatId = ?";
            case 27:
                return "UPDATE chat_folder SET isRemoved = 1 WHERE id=?";
            case 28:
                return "UPDATE chat_folder SET isHiddenForAllFolder=? WHERE id=?";
            default:
                return "DELETE FROM chat_folder";
        }
    }
}
