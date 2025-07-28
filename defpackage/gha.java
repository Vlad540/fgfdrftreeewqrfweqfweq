package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* renamed from: gha  reason: default package */
public final class gha {
    public final OutputConfiguration a;
    public long b = 1;

    public gha(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gha)) {
            return false;
        }
        gha gha = (gha) obj;
        return Objects.equals(this.a, gha.a) && this.b == gha.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 31;
        return Long.hashCode(this.b) ^ ((hashCode << 5) - hashCode);
    }
}
