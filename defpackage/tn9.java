package defpackage;

import android.media.AudioAttributes;

/* renamed from: tn9  reason: default package */
public abstract class tn9 {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(i);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
        return builder.setLegacyStreamType(i);
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(i);
    }
}
