package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: ni3  reason: default package */
public final class ni3 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final li3 i;
    public final int j;
    public final mi3 k;
    public final int l;
    public final int m;
    public final List n;
    public final String o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final long t;
    public final ji3 u;
    public final int[] v;

    public ni3(gi3 gi3) {
        this.a = gi3.a;
        this.b = gi3.d;
        this.c = gi3.b;
        this.d = gi3.c;
        this.e = gi3.e;
        ArrayList arrayList = new ArrayList(gi3.f);
        arrayList.removeIf(new ei3(0));
        arrayList.sort(Comparator.comparing(new fi3(0)));
        this.f = Collections.unmodifiableList(arrayList);
        this.g = gi3.g;
        this.h = gi3.h;
        this.i = gi3.i;
        this.j = gi3.j;
        this.k = gi3.k;
        this.l = gi3.l;
        this.m = gi3.m;
        this.n = gi3.n;
        this.o = gi3.o;
        this.p = gi3.p;
        this.q = gi3.q;
        this.r = gi3.r;
        this.s = gi3.s;
        this.t = gi3.t;
        this.u = gi3.u;
        this.v = gi3.v;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [gi3, java.lang.Object] */
    public static ni3 b(byte[] bArr) {
        mi3 mi3;
        int i2;
        byte[] bArr2 = b.a;
        try {
            Protos.Contact mergeFrom = gr8.mergeFrom(new Protos.Contact(), bArr);
            ? obj = new Object();
            obj.a = mergeFrom.serverId;
            obj.b = mergeFrom.baseUrl;
            obj.c = mergeFrom.baseRawUrl;
            obj.d = mergeFrom.deviceAvatarUrl;
            obj.e = mergeFrom.photoId;
            obj.g = mergeFrom.lastUpdateTime;
            obj.h = mergeFrom.serverPhone;
            obj.m = mergeFrom.settings;
            obj.o = mergeFrom.description;
            obj.p = mergeFrom.link;
            obj.q = mergeFrom.birthday;
            obj.r = mergeFrom.lastSearchClickTime;
            obj.s = mergeFrom.lastSyncTime;
            obj.t = mergeFrom.lastShowingUnknownContactBar;
            obj.v = mergeFrom.profileOptions;
            Protos.Contact.MenuButton menuButton = mergeFrom.menuButton;
            obj.u = menuButton == null ? null : new ji3(menuButton.text);
            ArrayList arrayList = new ArrayList();
            Protos.Contact.ContactName[] contactNameArr = mergeFrom.names;
            if (contactNameArr != null && contactNameArr.length > 0) {
                for (Protos.Contact.ContactName contactName : contactNameArr) {
                    String str = contactName.name;
                    String str2 = contactName.lastName;
                    hi3 hi3 = hi3.o;
                    int i3 = contactName.type;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            hi3 = hi3.a;
                        } else if (i3 == 2) {
                            hi3 = hi3.b;
                        } else if (i3 == 3) {
                            hi3 = hi3.c;
                        }
                    }
                    arrayList.add(new ii3(str, hi3, str2));
                }
            }
            obj.f = arrayList;
            int i4 = mergeFrom.status;
            obj.i = i4 != 1 ? i4 != 2 ? null : li3.b : li3.a;
            int i5 = mergeFrom.type;
            if (i5 == 0) {
                mi3 = mi3.a;
            } else if (i5 == 1) {
                mi3 = mi3.b;
            } else {
                throw new IllegalArgumentException("unknown proto.type " + mergeFrom.type);
            }
            obj.k = mi3;
            int i6 = mergeFrom.gender;
            if (i6 == 0) {
                i2 = 1;
            } else if (i6 == 1) {
                i2 = 2;
            } else if (i6 == 2) {
                i2 = 3;
            } else {
                throw new IllegalArgumentException("unknown proto.gender " + mergeFrom.gender);
            }
            obj.l = i2;
            ArrayList arrayList2 = new ArrayList();
            int[] iArr = mergeFrom.options;
            if (iArr != null && iArr.length > 0) {
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = iArr[i7];
                    arrayList2.add(i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? null : ki3.o : ki3.c : ki3.b : ki3.a);
                }
            }
            obj.n = arrayList2;
            return obj.a();
        } catch (InvalidProtocolBufferNanoException e2) {
            throw new IOException(e2);
        }
    }

    public final boolean a() {
        List list = this.f;
        if (list.isEmpty()) {
            return true;
        }
        return ((ii3) list.get(0)).equals(ii3.e);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gi3, java.lang.Object] */
    public final gi3 c() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.c;
        obj.c = this.d;
        obj.d = this.b;
        obj.e = this.e;
        obj.f = new ArrayList(this.f);
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = this.m;
        obj.n = new ArrayList(this.n);
        obj.o = this.o;
        obj.p = this.p;
        obj.q = this.q;
        obj.r = this.r;
        obj.s = this.s;
        obj.t = this.t;
        obj.u = this.u;
        obj.v = this.v;
        return obj;
    }

    public final byte[] d() {
        int i2;
        int i3;
        byte[] bArr = b.a;
        Protos.Contact contact = new Protos.Contact();
        contact.serverId = this.a;
        String str = "";
        String str2 = this.c;
        if (str2 == null) {
            str2 = str;
        }
        contact.baseUrl = str2;
        String str3 = this.d;
        if (str3 == null) {
            str3 = str;
        }
        contact.baseRawUrl = str3;
        String str4 = this.b;
        if (str4 == null) {
            str4 = str;
        }
        contact.deviceAvatarUrl = str4;
        contact.photoId = this.e;
        contact.lastUpdateTime = this.g;
        contact.serverPhone = this.h;
        contact.settings = this.m;
        String str5 = this.o;
        if (str5 == null) {
            str5 = str;
        }
        contact.description = str5;
        String str6 = this.p;
        if (str6 == null) {
            str6 = str;
        }
        contact.link = str6;
        String str7 = this.q;
        if (str7 == null) {
            str7 = str;
        }
        contact.birthday = str7;
        contact.lastSearchClickTime = this.r;
        contact.lastSyncTime = this.s;
        contact.lastShowingUnknownContactBar = this.t;
        contact.profileOptions = this.v;
        List list = this.f;
        if (!list.isEmpty()) {
            int size = list.size();
            contact.names = new Protos.Contact.ContactName[size];
            for (int i4 = 0; i4 < size; i4++) {
                ii3 ii3 = (ii3) list.get(i4);
                Protos.Contact.ContactName contactName = new Protos.Contact.ContactName();
                String str8 = ii3.a;
                if (str8 == null) {
                    str8 = str;
                }
                contactName.name = str8;
                String str9 = ii3.b;
                if (str9 == null) {
                    str9 = str;
                }
                contactName.lastName = str9;
                int ordinal = ii3.c.ordinal();
                if (ordinal == 0) {
                    i3 = 1;
                } else if (ordinal == 1) {
                    i3 = 2;
                } else if (ordinal == 2) {
                    i3 = 3;
                } else if (ordinal == 3) {
                    i3 = 0;
                } else {
                    throw new IncompatibleClassChangeError();
                }
                contactName.type = i3;
                contact.names[i4] = contactName;
            }
        }
        li3 li3 = this.i;
        if (li3 == null) {
            contact.status = 0;
        } else if (li3 == li3.a) {
            contact.status = 1;
        } else if (li3 == li3.b) {
            contact.status = 2;
        } else {
            throw new IllegalArgumentException("unknown status " + li3);
        }
        int ordinal2 = this.k.ordinal();
        if (ordinal2 == 0) {
            contact.type = 0;
        } else if (ordinal2 == 1) {
            contact.type = 1;
        } else {
            throw new IllegalArgumentException("unknown type");
        }
        int t2 = hr1.t(this.l);
        if (t2 == 0) {
            contact.gender = 0;
        } else if (t2 == 1) {
            contact.gender = 1;
        } else if (t2 == 2) {
            contact.gender = 2;
        } else {
            throw new IllegalArgumentException("unknown type");
        }
        ji3 ji3 = this.u;
        if (ji3 != null) {
            Protos.Contact.MenuButton menuButton = new Protos.Contact.MenuButton();
            String str10 = ji3.a;
            if (str10 != null) {
                str = str10;
            }
            menuButton.text = str;
            contact.menuButton = menuButton;
        }
        List list2 = this.n;
        if (!list2.isEmpty()) {
            contact.options = new int[list2.size()];
            for (int i5 = 0; i5 < contact.options.length; i5++) {
                int ordinal3 = ((ki3) list2.get(i5)).ordinal();
                if (ordinal3 == 0) {
                    i2 = 0;
                } else if (ordinal3 == 1) {
                    i2 = 1;
                } else if (ordinal3 == 2) {
                    i2 = 2;
                } else if (ordinal3 == 3) {
                    i2 = 3;
                } else {
                    throw new IncompatibleClassChangeError();
                }
                contact.options[i5] = i2;
            }
        }
        return gr8.toByteArray(contact);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ni3.class.getSimpleName());
        sb.append("{serverId=");
        sb.append(this.a);
        sb.append(",baseUrl=");
        sb.append(this.c);
        sb.append(",names=");
        sb.append(this.f);
        sb.append(",type=");
        sb.append(this.k);
        sb.append(",options=");
        sb.append(this.n);
        sb.append(",lastSyncTime=");
        return wn6.k(sb, this.s, "}");
    }
}
