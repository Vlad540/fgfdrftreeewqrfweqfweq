package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: io7  reason: default package */
public final class io7 extends ibe {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public io7(String str, boolean z, long j, long j2, long j3, String str2, long j4, long j5, long j6) {
        super(dfa.LOGIN);
        long j7;
        long j8 = j;
        long j9 = j2;
        long j10 = j3;
        String str3 = str2;
        long j11 = j4;
        long j12 = j5;
        long j13 = j6;
        s(ApiProtocol.KEY_TOKEN, str);
        d("interactive", z);
        if (j8 > 0) {
            n(j8, "chatsSync");
            j7 = 0;
        } else {
            j7 = 0;
        }
        if (j9 > j7) {
            n(j9, "contactsSync");
        }
        if (j10 != j7) {
            n(j10, "presenceSync");
        }
        if (!(str3 == null || str2.length() == 0)) {
            s("configHash", str3);
        }
        if (j11 > 0) {
            n(j11, "callsSync");
        }
        if (j12 > 0) {
            n(j12, "lastLogin");
        }
        if (j13 > 0) {
            n(j13, "draftsSync");
        }
    }

    public final jbe P() {
        return cqc.X;
    }

    public final boolean V() {
        return false;
    }
}
