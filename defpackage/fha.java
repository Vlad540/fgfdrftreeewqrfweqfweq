package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* renamed from: fha  reason: default package */
public final class fha {
    public final hha a;

    public fha(int i, Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.a = new hha(new OutputConfiguration(i, surface));
        } else {
            this.a = new hha(new gha(new OutputConfiguration(i, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fha)) {
            return false;
        }
        return this.a.equals(((fha) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public fha(OutputConfiguration outputConfiguration) {
        this.a = new hha(outputConfiguration);
    }

    public fha(hha hha) {
        this.a = hha;
    }
}
