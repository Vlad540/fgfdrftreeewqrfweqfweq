package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: tdc  reason: default package */
public final class tdc extends v2 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tdc(aec aec, int i) {
        super(aec);
        this.o = i;
    }

    public final String g() {
        switch (this.o) {
            case 0:
                return "DELETE FROM chat_folder WHERE id=?";
            case 1:
                return "INSERT OR REPLACE INTO folder_and_chats VALUES (?, ?)";
            case 2:
                return "DELETE FROM folder_and_chats WHERE folderId = ?";
            case 3:
                return "DELETE FROM folder_and_chats";
            case 4:
                return "INSERT OR REPLACE INTO saved_msg_chat(user_id, chat_id) VALUES(?, ?)";
            case 5:
                return "DELETE FROM saved_msg_chat WHERE chat_id = ?";
            case 6:
                return "DELETE FROM saved_msg_chat";
            case 7:
                return "DELETE FROM events";
            case 8:
                return "DELETE FROM sticker_sets";
            case 9:
                return "DELETE FROM stickers";
            case 10:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 11:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case Protos.Attaches.Attach.PRESENT:
                return "UPDATE tasks SET status = ? WHERE id = ?";
            case 13:
                return "UPDATE tasks SET data = ? WHERE id = ?";
            case Protos.Attaches.Attach.LOCATION:
                return "UPDATE tasks SET data = ?, status = ? WHERE id = ?";
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return "UPDATE tasks SET fails_count = fails_count + 1 WHERE id = ?";
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return "DELETE FROM tasks WHERE id = ?";
            case LangUtils.HASH_SEED:
                return "DELETE FROM tasks";
            case 18:
                return "DELETE FROM tasks WHERE type = ?";
            case 19:
                return "DELETE FROM uploads WHERE path=? AND upload_type=? AND last_modified=?";
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return "DELETE FROM uploads WHERE attach_id=?";
            case 21:
                return "DELETE FROM uploads WHERE photo_token=?";
            case 22:
                return "DELETE FROM uploads";
            case 23:
                return "DELETE FROM video_conversions WHERE source_uri=? AND quality=? AND start_trim_position=? AND end_trim_position=? AND mute=?";
            case 24:
                return "DELETE FROM video_conversions";
            case 25:
                return "UPDATE webapp_biometry SET token = ? WHERE user_id = ? AND bot_id = ?";
            case 26:
                return "UPDATE webapp_biometry SET access_requested = ?, access_granted = ? WHERE user_id = ? AND bot_id = ?";
            case 27:
                return "DELETE FROM webapp_biometry";
            case 28:
                return "DELETE FROM webapp_biometry WHERE user_id = ? AND bot_id = ?";
            default:
                return "DELETE from WorkProgress where work_spec_id=?";
        }
    }
}
