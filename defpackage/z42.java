package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: z42  reason: default package */
public final /* synthetic */ class z42 implements of3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long o;

    public /* synthetic */ z42(long j, long j2) {
        this.b = j;
        this.o = j2;
        this.c = null;
    }

    public final void accept(Object obj) {
        long j = this.b;
        long j2 = this.o;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                y52 y52 = (y52) obj;
                String str = (String) obj2;
                udd.p("t52", "reactions, updateLastReaction chatId = %d, lastReactedMessageId = %d, lastREaction = %s", new Object[]{Long.valueOf(j), Long.valueOf(j2), str});
                if (j2 == 0) {
                    y52.n0 = 0;
                    y52.o0 = null;
                    return;
                }
                if (y52.n0 != j2) {
                    y52.n0 = j2;
                }
                String str2 = y52.o0;
                if (str2 == null || !str2.equals(str)) {
                    y52.o0 = str;
                    return;
                }
                return;
            case 1:
                y52 y522 = (y52) obj;
                y522.getClass();
                y522.m0 = new k62(this.o, (String) obj2, this.b);
                return;
            default:
                m00 m00 = (m00) obj;
                to8 to8 = (to8) obj2;
                to8.getClass();
                if (m00.e != null && j2 != 0) {
                    yzc yzc = ((j2b) to8.c).b;
                    yzc.getClass();
                    if (j2 >= ((long) ((int) yzc.o(PmsKey.f76mindurationsaveaudiostarttime, (long) 20)))) {
                        if (j2 - j <= CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
                            j = 0;
                        }
                        l00 l00 = m00.e;
                        if (l00 == null) {
                            l00 = l00.j;
                        }
                        k00 a2 = l00.a();
                        a2.g = j;
                        a2.c = j2;
                        a2.h = System.currentTimeMillis();
                        m00.e = new l00(a2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ z42(long j, String str, long j2) {
        this.b = j;
        this.c = str;
        this.o = j2;
    }

    public /* synthetic */ z42(to8 to8, long j, long j2) {
        this.c = to8;
        this.b = j;
        this.o = j2;
    }
}
