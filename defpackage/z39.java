package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.logout.a;

/* renamed from: z39  reason: default package */
public final class z39 extends x39 {
    public final a c;
    public final dm4 d;

    public z39(a aVar, dm4 dm4) {
        super(1, 2);
        this.c = aVar;
        this.d = dm4;
    }

    public final void a(sz5 sz5) {
        udd.q("Migration_1_2", "start");
        lw2 lw2 = new lw2(this.d);
        ArrayList arrayList = new ArrayList();
        sz5.m();
        try {
            Cursor q0 = sz5.q0("SELECT * FROM chats");
            try {
                int columnIndex = q0.getColumnIndex(ApiProtocol.KEY_ID);
                int columnIndex2 = q0.getColumnIndex("data");
                while (q0.moveToNext()) {
                    if (!q0.isNull(columnIndex2)) {
                        long j = q0.getLong(columnIndex);
                        try {
                            arrayList.add(new Long[]{Long.valueOf(lw2.a(q0.getBlob(columnIndex2)).l), Long.valueOf(j)});
                        } catch (Throwable unused) {
                            udd.U("Migration_1_2", "could not parse blob for chat #" + j);
                        }
                    }
                }
                urd.l(q0, (Throwable) null);
                if (arrayList.isEmpty()) {
                    sz5.r0();
                    udd.q("Migration_1_2", "no data, finished!");
                    sz5.S();
                    return;
                }
                sz5.U("DROP INDEX IF EXISTS index_chats_server_id");
                sz5.U("CREATE INDEX IF NOT EXISTS `index_chats_server_id` ON `chats` (`server_id`)");
                sz5.U("ALTER TABLE chats ADD COLUMN cid INTEGER NOT NULL DEFAULT 0");
                sz5.U("CREATE INDEX IF NOT EXISTS `index_chats_cid` ON `chats` (`cid`)");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sz5.e0("UPDATE chats SET cid = ? WHERE id = ?", (Long[]) it.next());
                }
                sz5.U("CREATE TABLE IF NOT EXISTS `temp_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `constructor_id` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
                sz5.U("INSERT INTO temp_messages SELECT * FROM messages");
                sz5.U("DROP TABLE messages");
                sz5.U("ALTER TABLE temp_messages RENAME TO messages");
                sz5.U("CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)");
                sz5.U("CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)");
                sz5.U("CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)");
                sz5.U("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)");
                sz5.U("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
                sz5.U("CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)");
                sz5.r0();
                fn6 fn6 = udd.e;
                if (fn6 != null) {
                    if (fn6.c()) {
                        tn7 tn7 = tn7.X;
                        int size = arrayList.size();
                        fn6.d(tn7, "Migration_1_2", "finish! migrate " + size + " chats", (Throwable) null);
                    }
                }
                sz5.S();
            } catch (Throwable th) {
                urd.l(q0, th);
                throw th;
            }
        } catch (Throwable th2) {
            sz5.S();
            throw th2;
        }
    }
}
