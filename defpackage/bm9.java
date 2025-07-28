package defpackage;

import java.util.HashMap;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: bm9  reason: default package */
public final class bm9 extends ibe {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bm9(dfa dfa, int i) {
        super(dfa);
        this.o = i;
    }

    public short N() {
        switch (this.o) {
            case 1:
                jk9 jk9 = dfa.c;
                return 80;
            case 2:
                jk9 jk92 = dfa.c;
                return 1;
            case 3:
                jk9 jk93 = dfa.c;
                return 16;
            case 4:
                jk9 jk94 = dfa.c;
                return 60;
            case 5:
                jk9 jk95 = dfa.c;
                return 43;
            case 8:
                jk9 jk96 = dfa.c;
                return 97;
            case 9:
                jk9 jk97 = dfa.c;
                return 96;
            case 10:
                jk9 jk98 = dfa.c;
                return 193;
            case 11:
                jk9 jk99 = dfa.c;
                return 81;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                jk9 jk910 = dfa.c;
                return 119;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                jk9 jk911 = dfa.c;
                return 79;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                jk9 jk912 = dfa.c;
                return 83;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                jk9 jk913 = dfa.c;
                return 82;
            default:
                return super.N();
        }
    }

    public int O() {
        switch (this.o) {
            case 2:
                return 0;
            default:
                return super.O();
        }
    }

    public boolean w() {
        switch (this.o) {
            case 2:
                return true;
            default:
                return super.w();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bm9(int i, int i2) {
        super((dfa) null);
        this.o = 16;
        g(hr1.t(i), "type");
        g(i2, "count");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bm9(int i, long j, d10 d10, String str, String str2, String str3, String str4, String str5) {
        super((dfa) null);
        this.o = 3;
        if (str != null) {
            s("firstName", str);
        }
        if (str2 != null) {
            s("lastName", str2);
        }
        if (str3 != null) {
            s("photoToken", str3);
        }
        if (j != 0) {
            n(j, "photoId");
        }
        if (d10 != null) {
            p("crop", d10.a());
        }
        if (!r1g.p(str4)) {
            s("description", str4.equals("$REMOVE$") ? "" : str4);
        }
        if (!r1g.p(str5)) {
            s("link", str5.equals("$REMOVE$") ? "" : str5);
        }
        s("avatarType", hr1.e(i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bm9(long j) {
        super((dfa) null);
        this.o = 5;
        if (j != 0) {
            n(j, "photoId");
            return;
        }
        throw new IllegalArgumentException("photoId must not be 0");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bm9(Boolean bool) {
        super((dfa) null);
        this.o = 1;
        g(1, "count");
        ((HashMap) this.b).put("profile", bool);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bm9(String str, long j, long j2, long j3) {
        super((dfa) null);
        this.o = 15;
        n(j, "videoId");
        if (j2 != 0) {
            n(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j3 > 0) {
            n(j3, "messageId");
        }
        if (!r1g.p(str)) {
            s(ApiProtocol.KEY_TOKEN, str);
        }
    }
}
