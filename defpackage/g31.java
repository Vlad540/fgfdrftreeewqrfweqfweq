package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: g31  reason: default package */
public final class g31 implements l31 {
    public final CallsAudioDeviceInfo a;
    public final boolean b;
    public final int c = o1a.G;
    public final int d;
    public final int e;
    public final jge f;
    public final jge g;

    public g31(CallsAudioDeviceInfo callsAudioDeviceInfo, boolean z) {
        this.a = callsAudioDeviceInfo;
        this.b = z;
        this.d = z ? n1a.v : n1a.u;
        this.e = n1a.D0;
        jge jge = new jge(r1a.Z1, cs.g0(new Object[]{callsAudioDeviceInfo.getName()}));
        this.f = jge;
        this.g = jge;
    }

    public final int a() {
        return this.d;
    }

    public final CallsAudioDeviceInfo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g31)) {
            return false;
        }
        g31 g31 = (g31) obj;
        return hhd.f(this.a, g31.a) && this.b == g31.b;
    }

    public final mge getContentDescription() {
        return this.g;
    }

    public final int getIcon() {
        return this.e;
    }

    public final int getId() {
        return this.c;
    }

    public final mge getTitle() {
        return this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Bluetooth(device=" + this.a + ", isGroupCallEnabled=" + this.b + ")";
    }
}
