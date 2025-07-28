package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: k2c  reason: default package */
public final /* synthetic */ class k2c implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2c b;
    public final /* synthetic */ OneMeRoomDatabase c;
    public final /* synthetic */ List d;

    public /* synthetic */ k2c(n2c n2c, OneMeRoomDatabase oneMeRoomDatabase, List list, int i) {
        this.a = i;
        this.b = n2c;
        this.c = oneMeRoomDatabase;
        this.d = list;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                n2c n2c = this.b;
                n2c.getClass();
                OneMeRoomDatabase oneMeRoomDatabase = this.c;
                oneMeRoomDatabase.q(new px4(n2c, oneMeRoomDatabase, this.d, 23));
                return;
            default:
                n2c n2c2 = this.b;
                n2c2.getClass();
                this.c.q(new hg9(n2c2, 26, (ArrayList) this.d));
                return;
        }
    }
}
