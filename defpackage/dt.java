package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: dt  reason: default package */
public final class dt extends ibe {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt(dfa dfa, int i) {
        super(dfa);
        this.o = i;
    }

    public short N() {
        switch (this.o) {
            case 0:
                jk9 jk9 = dfa.c;
                return 29;
            case 1:
                jk9 jk92 = dfa.c;
                return 28;
            case 2:
                jk9 jk93 = dfa.c;
                return 26;
            case 3:
                jk9 jk94 = dfa.c;
                return 261;
            case 4:
                jk9 jk95 = dfa.c;
                return 260;
            case 5:
                jk9 jk96 = dfa.c;
                return 259;
            case 6:
                jk9 jk97 = dfa.c;
                return 27;
            case 10:
                jk9 jk98 = dfa.c;
                return 76;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return dfa.CHAT_BOT_COMMANDS.a;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                jk9 jk99 = dfa.c;
                return 54;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                jk9 jk910 = dfa.c;
                return 61;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                jk9 jk911 = dfa.c;
                return 117;
            case LangUtils.HASH_SEED /*17*/:
                jk9 jk912 = dfa.c;
                return 63;
            case 18:
                jk9 jk913 = dfa.c;
                return 52;
            case 19:
                return dfa.CHAT_HIDE.a;
            case 21:
                jk9 jk914 = dfa.c;
                return 48;
            case 22:
                jk9 jk915 = dfa.c;
                return 57;
            case 23:
                jk9 jk916 = dfa.c;
                return 58;
            case 24:
                jk9 jk917 = dfa.c;
                return 50;
            case 26:
                jk9 jk918 = dfa.c;
                return 59;
            case 27:
                jk9 jk919 = dfa.c;
                return 77;
            case 28:
                jk9 jk920 = dfa.c;
                return 86;
            case 29:
                jk9 jk921 = dfa.c;
                return 68;
            default:
                return super.N();
        }
    }

    public boolean V() {
        switch (this.o) {
            case 7:
                return false;
            case 8:
                return false;
            case 11:
                return true;
            default:
                return super.V();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt(int i, long j, long j2, long j3) {
        super((dfa) null);
        this.o = 6;
        if (i != 0) {
            s("type", hr1.d(i));
        }
        n(j, "sync");
        if (j2 != 0) {
            n(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j3 != 0) {
            n(j3, "userId");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt(int i, String str, long j, int i2, String str2) {
        super((dfa) null);
        this.o = 2;
        if (i != 0 || !r1g.p(str)) {
            if (i != 0) {
                s("type", hr1.d(i));
            }
            if (!r1g.p(str)) {
                s("sectionId", str);
            }
            n(j, "from");
            g(i2, "count");
            if (str2 != null) {
                s("query", str2);
                return;
            }
            return;
        }
        throw new RuntimeException("Asset type or sectionId should be set");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt(int i, long[] jArr) {
        super((dfa) null);
        this.o = 1;
        if (i == 0) {
            throw new IllegalArgumentException("type must not be null");
        } else if (jArr == null || jArr.length == 0) {
            throw new IllegalArgumentException("ids must not be null or empty");
        } else {
            s("type", hr1.d(i));
            i("ids", jArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt(long j, int i, List list, ch2 ch2, boolean z, int i2, int i3) {
        super((dfa) null);
        this.o = 27;
        n(j, ApiProtocol.PARAM_CHAT_ID);
        s("operation", th2.b(i));
        h("userIds", list);
        s("type", ch2.a);
        if (i == 1) {
            d("showHistory", z);
        }
        if (i2 != 0) {
            g(i2, "cleanMsgPeriod");
        }
        if (i3 != 0) {
            g(i3, "permissions");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt(long j, String str, long j2, int i, String str2) {
        super((dfa) null);
        this.o = 26;
        n(j, ApiProtocol.PARAM_CHAT_ID);
        if (!r1g.p(str)) {
            s("type", str);
        }
        if (j2 != 0) {
            n(j2, "marker");
        }
        if (i > 0) {
            g(i, "count");
        }
        if (!r1g.p(str2)) {
            s("query", str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt(String str) {
        super((dfa) null);
        this.o = 22;
        if (!r1g.p(str)) {
            s("link", str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt(String str, String str2) {
        super((dfa) null);
        this.o = 29;
        s("query", str);
        g(50, "count");
        if (!r1g.p(str2)) {
            s("marker", str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt(long j, Long l, Set set, Integer num, Integer num2) {
        super(dfa.CHAT_MEDIA);
        this.o = 25;
        n(j, ApiProtocol.PARAM_CHAT_ID);
        ((HashMap) this.b).put("messageId", l);
        if (set != null && !set.isEmpty()) {
            e00 e00 = e00.UNKNOWN;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                switch (((e00) it.next()).ordinal()) {
                    case 2:
                        arrayList.add("PHOTO");
                        break;
                    case 3:
                        arrayList.add("VIDEO");
                        break;
                    case 4:
                        arrayList.add("AUDIO");
                        break;
                    case 6:
                        arrayList.add("SHARE");
                        break;
                    case 7:
                        arrayList.add("APP");
                        break;
                    case 8:
                        arrayList.add("CALL");
                        break;
                    case 9:
                        arrayList.add("FILE");
                        break;
                    case 10:
                        arrayList.add("CONTACT");
                        break;
                    case 11:
                        arrayList.add("PRESENT");
                        break;
                    case Protos.Attaches.Attach.PRESENT /*12*/:
                        arrayList.add("INLINE_KEYBOARD");
                        break;
                    case 13:
                        arrayList.add("LOCATION");
                        break;
                    case Protos.Attaches.Attach.LOCATION /*14*/:
                        arrayList.add("REPLY_KEYBOARD");
                        break;
                }
            }
            h("attachTypes", arrayList);
        }
        ((HashMap) this.b).put("forward", num);
        ((HashMap) this.b).put("backward", num2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt(long j, long j2, int i, long j3, int i2, long j4, boolean z, boolean z2, String str, md4 md4) {
        super(dfa.CHAT_HISTORY);
        this.o = 20;
        n(j, ApiProtocol.PARAM_CHAT_ID);
        n(j2, "from");
        g(i, "forward");
        n(j3, "forwardTime");
        g(i2, "backward");
        n(j4, "backwardTime");
        d("getChat", z);
        d("getMessages", z2);
        if (!(str == null || str.length() == 0)) {
            s("chatAccessToken", str);
        }
        s("itemType", md4.name());
    }
}
