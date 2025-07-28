package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: i31  reason: default package */
public final class i31 implements l31 {
    public final CallsAudioDeviceInfo a;
    public final int b = o1a.I;
    public final int c = n1a.s0;
    public final int d = n1a.F0;
    public final hge e;
    public final hge f;

    public i31(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.a = callsAudioDeviceInfo;
        hge hge = new hge(r1a.b2);
        this.e = hge;
        this.f = hge;
    }

    public final int a() {
        return this.c;
    }

    public final CallsAudioDeviceInfo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i31) && hhd.f(this.a, ((i31) obj).a);
    }

    public final mge getContentDescription() {
        return this.f;
    }

    public final int getIcon() {
        return this.d;
    }

    public final int getId() {
        return this.b;
    }

    public final mge getTitle() {
        return this.e;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Speakerphone(device=" + this.a + ")";
    }
}
