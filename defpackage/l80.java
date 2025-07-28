package defpackage;

import android.media.MediaFormat;

/* renamed from: l80  reason: default package */
public final class l80 implements kx4 {
    public final String a;
    public final int b;
    public final kje c;
    public final int d;
    public final int e;
    public final int f;

    public l80(String str, int i, kje kje, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        this.c = kje;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String a() {
        return this.a;
    }

    public final MediaFormat b() {
        String str = this.a;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, this.e, this.f);
        createAudioFormat.setInteger("bitrate", this.d);
        int i = this.b;
        if (i != -1) {
            if (str.equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", i);
            } else {
                createAudioFormat.setInteger("profile", i);
            }
        }
        return createAudioFormat;
    }

    public final kje c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l80)) {
            return false;
        }
        l80 l80 = (l80) obj;
        return this.a.equals(l80.a) && this.b == l80.b && this.c.equals(l80.c) && this.d == l80.d && this.e == l80.e && this.f == l80.f;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", bitrate=");
        sb.append(this.d);
        sb.append(", sampleRate=");
        sb.append(this.e);
        sb.append(", channelCount=");
        return wn6.j(sb, this.f, "}");
    }
}
