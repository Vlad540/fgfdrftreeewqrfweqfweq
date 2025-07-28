package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aj8  reason: default package */
public final class aj8 implements Parcelable {
    public static final Parcelable.Creator<aj8> CREATOR = new vf7(16);
    public final long a;
    public final ch2 b;
    public final boolean c;
    public final Integer o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj8(long j, ch2 ch2, Integer num, int i) {
        this(j, ch2, true, (i & 8) != 0 ? null : num);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj8)) {
            return false;
        }
        aj8 aj8 = (aj8) obj;
        return this.a == aj8.a && this.b == aj8.b && this.c == aj8.c && hhd.f(this.o, aj8.o);
    }

    public final int hashCode() {
        int f = th2.f((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
        Integer num = this.o;
        return f + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "MembersListArgs(chatId=" + this.a + ", chatMemberType=" + this.b + ", isLongClickEnabled=" + this.c + ", memberLimit=" + this.o + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeLong(this.a);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
        Integer num = this.o;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public aj8(long j, ch2 ch2, boolean z, Integer num) {
        this.a = j;
        this.b = ch2;
        this.c = z;
        this.o = num;
    }
}
