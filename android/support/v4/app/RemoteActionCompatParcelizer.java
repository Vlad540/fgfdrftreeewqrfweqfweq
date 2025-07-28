package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;

public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(g1f g1f) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(g1f);
    }

    public static void write(RemoteActionCompat remoteActionCompat, g1f g1f) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, g1f);
    }
}
