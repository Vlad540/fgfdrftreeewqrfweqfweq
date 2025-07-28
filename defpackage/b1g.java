package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;

/* renamed from: b1g  reason: default package */
public final class b1g extends z59 {
    public final /* synthetic */ zgc b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1g(zgc zgc, Looper looper) {
        super(looper, 4, false);
        this.b = zgc;
        Looper.getMainLooper();
    }

    public final void handleMessage(Message message) {
        zgc zgc = this.b;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new a2g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof m2g) {
                        zgc.g = (m2g) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        zgc.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            "Received InstanceID error ".concat(stringExtra2);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                                "Unexpected structured response ".concat(stringExtra2);
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            zgc.b(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (zgc.a) {
                            int i = 0;
                            while (true) {
                                try {
                                    kgd kgd = zgc.a;
                                    if (i < kgd.c) {
                                        zgc.b((String) kgd.f(i), intent2.getExtras());
                                        i++;
                                    }
                                } finally {
                                }
                            }
                        }
                        return;
                    }
                    Matcher matcher = zgc.j.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            zgc.b(group, extras);
                        }
                    } else if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response string: ".concat(stringExtra);
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    "Unexpected response action: ".concat(String.valueOf(action));
                }
            }
        }
    }
}
