package defpackage;

import java.util.HashMap;

/* renamed from: dfa  reason: default package */
public enum dfa {
    DEBUG(2, (int) null),
    RECONNECT(3, (int) null),
    LOG(5, (int) null),
    SESSION_INIT(6, (int) null),
    AUTH_REQUEST(17, (int) null),
    AUTH(18, (int) null),
    LOGIN(19, g02.X),
    LOGOUT(20, (int) null),
    SYNC(21, (int) null),
    AUTH_CONFIRM(23, (int) null),
    ASSETS_GET(26, (int) null),
    ASSETS_UPDATE(27, (int) null),
    ASSETS_GET_BY_IDS(28, (int) null),
    ASSETS_LIST_MODIFY(261, (int) null),
    ASSETS_REMOVE(259, (int) null),
    ASSETS_MOVE(260, (int) null),
    ASSETS_ADD(29, (int) null),
    PRESET_AVATARS(25, s59.o),
    CONTACT_INFO(32, bqc.c),
    CONTACT_INFO_BY_PHONE(46, j06.c),
    CONTACT_VERIFY(42, (int) null),
    REMOVE_CONTACT_PHOTO(43, (int) null),
    CHAT_HISTORY(49, (int) null),
    CHAT_MEDIA(51, (int) null),
    CHATS_LIST(53, (int) null),
    CHAT_UPDATE(55, (int) null),
    CHAT_CHECK_LINK(56, (int) null),
    CHAT_JOIN(57, (int) null),
    CHAT_LEAVE(58, (int) null),
    CHAT_MEMBERS(59, (int) null),
    PUBLIC_SEARCH(60, (int) null),
    CHAT_CLOSE(61, (int) null),
    CHAT_CREATE(63, (int) null),
    MSG_SEND(64, (int) null),
    MSG_DELETE(66, (int) null),
    MSG_EDIT(67, (int) null),
    MSG_DELETE_RANGE(92, (int) null),
    MSG_GET_REACTIONS(180, om3.o),
    MSG_SHARE_PREVIEW(70, (int) null),
    MSG_GET(71, (int) null),
    MSG_GET_STAT(74, (int) null),
    CHAT_SUBSCRIBE(75, (int) null),
    VIDEO_CHAT_START(76, (int) null),
    CHAT_MEMBERS_UPDATE(77, (int) null),
    VIDEO_CHAT_HISTORY(79, (int) null),
    STICKER_UPLOAD(81, (int) null),
    VIDEO_UPLOAD(82, (int) null),
    VIDEO_PLAY(83, (int) null),
    CHAT_PIN_SET_VISIBILITY(86, (int) null),
    FILE_UPLOAD(87, (int) null),
    FILE_DOWNLOAD(88, (int) null),
    LINK_INFO(89, (int) null),
    SESSIONS_INFO(96, (int) null),
    SESSIONS_CLOSE(97, (int) null),
    PHONE_BIND_REQUEST(98, (int) null),
    PHONE_BIND_CONFIRM(99, (int) null),
    CONFIRM_PRESENT(101, (int) null),
    GET_INBOUND_CALLS(103, (int) null),
    EXTERNAL_CALLBACK(105, g02.o),
    CALLS_TOKEN(158, (int) null),
    CHAT_COMPLAIN(117, (int) null),
    MSG_SEND_CALLBACK(118, (int) null),
    LOCATION_STOP(124, (int) null),
    LOCATION_SEND(125, (int) null),
    LOCATION_REQUEST(126, (int) null),
    GET_LAST_MENTIONS(127, (int) null),
    STICKER_CREATE(193, (int) null),
    STICKER_SUGGEST(194, (int) null),
    VIDEO_CHAT_MEMBERS(195, (int) null),
    NOTIF_MESSAGE(128, dm9.a),
    NOTIF_TYPING(129, (int) null),
    NOTIF_MARK(130, (int) null),
    NOTIF_CONTACT(131, (int) null),
    NOTIF_PRESENCE(132, (int) null),
    NOTIF_CONFIG(134, (int) null),
    NOTIF_CHAT(135, (int) null),
    NOTIF_ATTACH(136, (int) null),
    NOTIF_CALL_START(137, (int) null),
    NOTIF_CONTACT_SORT(139, (int) null),
    NOTIF_MSG_DELETE_RANGE(140, (int) null),
    NOTIF_MSG_DELETE(142, lu7.c),
    NOTIF_MSG_REACTIONS_CHANGED(155, (int) null),
    NOTIF_MSG_YOU_REACTED(156, (int) null),
    NOTIF_CALLBACK_ANSWER(143, (int) null),
    CHAT_BOT_COMMANDS(144, (int) null),
    BOT_INFO(145, ns7.b),
    NOTIF_LOCATION(147, (int) null),
    NOTIF_LOCATION_REQUEST(148, (int) null),
    NOTIF_ASSETS_UPDATE(150, (int) null),
    NOTIF_DRAFT(152, (int) null),
    NOTIF_DRAFT_DISCARD(153, (int) null),
    DRAFT_SAVE(176, (int) null),
    DRAFT_DISCARD(177, (int) null),
    CHAT_HIDE(196, (int) null),
    CHAT_SEARCH_COMMON_PARTICIPANTS(198, (int) null),
    NOTIF_MSG_DELAYED(154, ns7.Y),
    PROFILE_DELETE(199, lk9.Y),
    PROFILE_DELETE_TIME(200, mk9.X),
    WEB_APP_INIT_DATA(160, smc.Z);
    
    public static final jk9 c = null;
    public static final HashMap o = null;
    public final short a;
    public final i13 b;

    /* JADX WARNING: type inference failed for: r0v2, types: [jk9, java.lang.Object] */
    static {
        dfa[] dfaArr;
        pz4 pz4 = new pz4(dfaArr);
        c = new Object();
        o = new HashMap();
        u1 u1Var = new u1(0, pz4);
        while (u1Var.hasNext()) {
            dfa dfa = (dfa) u1Var.next();
            o.put(Short.valueOf(dfa.a), dfa.name());
        }
    }

    /* access modifiers changed from: public */
    dfa(short s, i13 i13) {
        this.a = s;
        this.b = i13;
    }

    public static final String b(short s) {
        c.getClass();
        HashMap hashMap = o;
        Short valueOf = Short.valueOf(s);
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = jk9.l(s);
            hashMap.put(valueOf, obj);
        }
        return (String) obj;
    }

    public final i13 a() {
        return this.b;
    }

    public final short c() {
        return this.a;
    }
}
