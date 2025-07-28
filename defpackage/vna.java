package defpackage;

import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: vna  reason: default package */
public abstract class vna {
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, wna] */
    public static wna a(Person person) {
        IconCompat iconCompat;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            iconCompat = zn6.a(icon);
        } else {
            iconCompat = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean isBot = person.isBot();
        boolean isImportant = person.isImportant();
        ? obj = new Object();
        obj.a = name;
        obj.b = iconCompat;
        obj.c = uri;
        obj.d = key;
        obj.e = isBot;
        obj.f = isImportant;
        return obj;
    }

    public static Person b(wna wna) {
        Person.Builder name = new Person.Builder().setName(wna.a);
        Icon icon = null;
        IconCompat iconCompat = wna.b;
        if (iconCompat != null) {
            iconCompat.getClass();
            icon = zn6.d(iconCompat, (Context) null);
        }
        return name.setIcon(icon).setUri(wna.c).setKey(wna.d).setBot(wna.e).setImportant(wna.f).build();
    }
}
