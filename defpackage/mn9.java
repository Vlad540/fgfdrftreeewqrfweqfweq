package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.LocusId;

/* renamed from: mn9  reason: default package */
public abstract class mn9 {
    public static boolean a(Notification notification) {
        return notification.getAllowSystemGeneratedContextualActions();
    }

    public static Notification.BubbleMetadata b(Notification notification) {
        return notification.getBubbleMetadata();
    }

    public static int c(RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static LocusId d(Notification notification) {
        return notification.getLocusId();
    }

    public static boolean e(Notification.Action action) {
        return action.isContextual();
    }
}
