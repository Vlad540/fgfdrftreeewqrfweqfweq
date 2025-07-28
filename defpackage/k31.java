package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: k31  reason: default package */
public final class k31 implements l31 {
    public final CallsAudioDeviceInfo a;
    public final int b = o1a.K;
    public final int c = n1a.O;
    public final int d = n1a.N;
    public final hge e;
    public final hge f;

    public k31(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.a = callsAudioDeviceInfo;
        hge hge = new hge(r1a.d2);
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
        return (obj instanceof k31) && hhd.f(this.a, ((k31) obj).a);
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
        return "WiredHeadset(device=" + this.a + ")";
    }
}
