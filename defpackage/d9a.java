package defpackage;

/* renamed from: d9a  reason: default package */
public final class d9a extends x39 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d9a(int i) {
        super(2, 3);
        this.c = i;
        switch (i) {
            case 1:
                super(3, 4);
                this.d = new Object();
                return;
            case 2:
                super(14, 15);
                this.d = new smc(6);
                return;
            default:
                this.d = new Object();
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0152, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0153, code lost:
        urd.l(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0156, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(sz5 r5) {
        /*
            r4 = this;
            int r0 = r4.c
            switch(r0) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0040;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"
            java.lang.String r1 = "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`"
            java.lang.String r2 = "DROP TABLE `WorkSpec`"
            java.lang.String r3 = "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`"
            defpackage.us8.m(r5, r0, r1, r2, r3)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"
            r5.U(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)"
            r5.U(r0)
            java.lang.Object r4 = r4.d
            smc r4 = (defpackage.smc) r4
            r4.getClass()
            java.lang.String r4 = "UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0"
            r5.U(r4)
            android.content.ContentValues r4 = new android.content.ContentValues
            r0 = 1
            r4.<init>(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "last_enqueue_time"
            r4.put(r1, r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r5.s0(r4, r0)
            return
        L_0x0040:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `_new_phones` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `phonebook_id` INTEGER NOT NULL, `contact_id` INTEGER NOT NULL, `phone` TEXT NOT NULL, `server_phone` INTEGER NOT NULL, `email` TEXT, `first_name` TEXT NOT NULL, `last_name` TEXT, `avatar_path` TEXT, `type` INTEGER NOT NULL)"
            java.lang.String r1 = "INSERT INTO `_new_phones` (`id`,`phonebook_id`,`contact_id`,`phone`,`server_phone`,`email`,`first_name`,`avatar_path`,`type`) SELECT `id`,`phonebook_id`,`contact_id`,`phone`,`server_phone`,`email`,`name`,`avatar_path`,`type` FROM `phones`"
            java.lang.String r2 = "DROP TABLE `phones`"
            java.lang.String r3 = "ALTER TABLE `_new_phones` RENAME TO `phones`"
            defpackage.us8.m(r5, r0, r1, r2, r3)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_phones_phonebook_id` ON `phones` (`phonebook_id`)"
            r5.U(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_phones_type` ON `phones` (`type`)"
            r5.U(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_phones_server_phone` ON `phones` (`server_phone`)"
            r5.U(r0)
            java.lang.Object r4 = r4.d
            lk9 r4 = (lk9) r4
            r4.getClass()
            java.lang.String r4 = "DELETE FROM phones"
            r5.U(r4)
            return
        L_0x0067:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `_new_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )"
            java.lang.String r1 = "INSERT INTO `_new_messages` (`id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_chat_id`,`msg_link_chat_name`,`msg_link_chat_link`,`msg_link_out_chat_id`,`msg_link_out_msg_id`,`type`,`chat_id`,`ttl`,`channel_views`,`channel_forwards`,`view_time`,`zoom`,`options`,`live_until`,`elements`,`reactions`,`delayed_attrs_time_to_fire`,`delayed_attrs_notify_sender`) SELECT `id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_chat_id`,`msg_link_chat_name`,`msg_link_chat_link`,`msg_link_out_chat_id`,`msg_link_out_msg_id`,`type`,`chat_id`,`ttl`,`channel_views`,`channel_forwards`,`view_time`,`zoom`,`options`,`live_until`,`elements`,`reactions`,`delayed_attrs_time_to_fire`,`delayed_attrs_notify_sender` FROM `messages`"
            java.lang.String r2 = "DROP TABLE `messages`"
            java.lang.String r3 = "ALTER TABLE `_new_messages` RENAME TO `messages`"
            defpackage.us8.m(r5, r0, r1, r2, r3)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)"
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)"
            java.lang.String r2 = "CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)"
            java.lang.String r3 = "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)"
            defpackage.us8.m(r5, r0, r1, r2, r3)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)"
            r5.U(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)"
            r5.U(r0)
            java.lang.String r0 = "PRAGMA foreign_key_check(`messages`)"
            android.database.Cursor r0 = r5.q0(r0)
            int r1 = r0.getCount()     // Catch:{ all -> 0x0150 }
            if (r1 > 0) goto L_0x00b3
            r1 = 0
            urd.l(r0, r1)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `_new_stickers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sticker_id` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `url` TEXT, `update_time` INTEGER NOT NULL, `mp4_url` TEXT, `first_url` TEXT, `preview_url` TEXT, `tags` TEXT NOT NULL, `sticker_type` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `lottie_url` TEXT, `audio` INTEGER NOT NULL, `author_type` INTEGER NOT NULL)"
            r5.U(r0)
            java.lang.String r0 = "INSERT INTO `_new_stickers` (`id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type`) SELECT `id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type` FROM `stickers`"
            r5.U(r0)
            java.lang.String r0 = "DROP TABLE `stickers`"
            r5.U(r0)
            java.lang.String r0 = "ALTER TABLE `_new_stickers` RENAME TO `stickers`"
            r5.U(r0)
            java.lang.Object r4 = r4.d
            kk9 r4 = (kk9) r4
            r4.getClass()
            return
        L_0x00b3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            r4.<init>()     // Catch:{ all -> 0x0150 }
            int r5 = r0.getCount()     // Catch:{ all -> 0x0150 }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0150 }
            r1.<init>()     // Catch:{ all -> 0x0150 }
        L_0x00c1:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0150 }
            if (r2 == 0) goto L_0x00f3
            boolean r2 = r0.isFirst()     // Catch:{ all -> 0x0150 }
            if (r2 == 0) goto L_0x00df
            java.lang.String r2 = "Foreign key violation(s) detected in '"
            r4.append(r2)     // Catch:{ all -> 0x0150 }
            r2 = 0
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0150 }
            r4.append(r2)     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = "'.\n"
            r4.append(r2)     // Catch:{ all -> 0x0150 }
        L_0x00df:
            r2 = 3
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0150 }
            boolean r3 = r1.containsKey(r2)     // Catch:{ all -> 0x0150 }
            if (r3 != 0) goto L_0x00c1
            r3 = 2
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x0150 }
            r1.put(r2, r3)     // Catch:{ all -> 0x0150 }
            goto L_0x00c1
        L_0x00f3:
            java.lang.String r2 = "Number of different violations discovered: "
            r4.append(r2)     // Catch:{ all -> 0x0150 }
            java.util.Set r2 = r1.keySet()     // Catch:{ all -> 0x0150 }
            int r2 = r2.size()     // Catch:{ all -> 0x0150 }
            r4.append(r2)     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = "\nNumber of rows in violation: "
            r4.append(r2)     // Catch:{ all -> 0x0150 }
            r4.append(r5)     // Catch:{ all -> 0x0150 }
            java.lang.String r5 = "\nViolation(s) detected in the following constraint(s):\n"
            r4.append(r5)     // Catch:{ all -> 0x0150 }
            java.util.Set r5 = r1.entrySet()     // Catch:{ all -> 0x0150 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0150 }
        L_0x0118:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0150 }
            if (r1 == 0) goto L_0x0146
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0150 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0150 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0150 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = "\tParent Table = "
            r4.append(r3)     // Catch:{ all -> 0x0150 }
            r4.append(r1)     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = ", Foreign Key Constraint Index = "
            r4.append(r1)     // Catch:{ all -> 0x0150 }
            r4.append(r2)     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "\n"
            r4.append(r1)     // Catch:{ all -> 0x0150 }
            goto L_0x0118
        L_0x0146:
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0150 }
            android.database.sqlite.SQLiteConstraintException r5 = new android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0150 }
            r5.<init>(r4)     // Catch:{ all -> 0x0150 }
            throw r5     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0152 }
        L_0x0152:
            r5 = move-exception
            urd.l(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d9a.a(sz5):void");
    }
}
