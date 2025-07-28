package defpackage;

import android.widget.ArrayAdapter;

/* renamed from: rc  reason: default package */
public final class rc extends ArrayAdapter {
    public final long getItemId(int i) {
        return (long) i;
    }

    public final boolean hasStableIds() {
        return true;
    }
}
