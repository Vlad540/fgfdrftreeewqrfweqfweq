package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: sc8  reason: default package */
public final class sc8 implements Parcelable {
    public static final Parcelable.Creator<sc8> CREATOR = new vf7(12);
    public final c58 a;
    public final long b;
    public MediaSession.QueueItem c;

    public sc8(MediaSession.QueueItem queueItem, c58 c58, long j) {
        if (c58 == null) {
            throw new IllegalArgumentException("Description cannot be null");
        } else if (j != -1) {
            this.a = c58;
            this.b = j;
            this.c = queueItem;
        } else {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
    }

    public static ArrayList a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
            arrayList.add(new sc8(queueItem, c58.a(rc8.b(queueItem)), rc8.c(queueItem)));
        }
        return arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.a);
        sb.append(", Id=");
        return wn6.k(sb, this.b, " }");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public sc8(Parcel parcel) {
        this.a = c58.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
