package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: v80  reason: default package */
public final class v80 {
    public final Executor a;
    public final Handler b;

    public v80(Executor executor, Handler handler) {
        if (executor != null) {
            this.a = executor;
            if (handler != null) {
                this.b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v80)) {
            return false;
        }
        v80 v80 = (v80) obj;
        return this.a.equals(v80.a) && this.b.equals(v80.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
