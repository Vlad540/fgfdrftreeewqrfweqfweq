package ru.ok.tamtam.nano;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;

public interface Protos {

    public static final class Attaches extends gr8 {
        private static volatile Attaches[] _emptyArray;
        public Attach[] attach;
        public Attach.InlineKeyboard keyboard;
        public Attach.ReplyKeyboard replyKeyboard;
        public Attach.SendAction sendAction;

        public static final class Attach extends gr8 {
            public static final int APP = 7;
            public static final int AUDIO = 4;
            public static final int CALL = 8;
            public static final int CANCELLED = 1;
            public static final int CONTACT = 11;
            public static final int CONTROL = 1;
            public static final int DAILY_MEDIA = 15;
            public static final int DEFAULT = 0;
            public static final int ERROR = 3;
            public static final int FILE = 10;
            public static final int INLINE_KEYBOARD = 13;
            public static final int LOADED = 2;
            public static final int LOADING = 4;
            public static final int LOCATION = 14;
            public static final int MUSIC = 9;
            public static final int NOT_LOADED = 0;
            public static final int PHOTO = 2;
            public static final int PRESENT = 12;
            public static final int PROCESSED = 2;
            public static final int PROCESSING = 1;
            public static final int SHARE = 6;
            public static final int STICKER = 5;
            public static final int UNKNOWN = 0;
            public static final int VIDEO = 3;
            private static volatile Attach[] _emptyArray;
            public App app;
            public Audio audio;
            public long bytesDownloaded;
            public Call call;
            public Contact contact;
            public Control control;
            public File file;
            public InlineKeyboard inlineKeyboard;
            public boolean isDeleted;
            public boolean isProcessingOnServer;
            public long lastErrorTime;
            public long lastModified;
            public String localId;
            public String localPath;
            public Location location;
            public Photo photo;
            public Present present;
            public int processingOnServerStatus;
            public int progress;
            public float progressFloat;
            public boolean sensitive;
            public boolean sensitiveContentUnlocked;
            public Share share;
            public int status;
            public Sticker sticker;
            public long totalBytes;
            public int type;
            public Video video;

            public static final class App extends gr8 {
                private static volatile App[] _emptyArray;
                public long appId;
                public String appState;
                public String icon;
                public String message;
                public String name;
                public int state;
                public long timeout;

                public App() {
                    clear();
                }

                public static App[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new App[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new App(), bArr);
                }

                public App clear() {
                    this.appId = 0;
                    this.name = "";
                    this.icon = "";
                    this.message = "";
                    this.state = 0;
                    this.timeout = 0;
                    this.appState = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.appId;
                    int h = j != 0 ? o13.h(1, j) : 0;
                    if (!this.name.equals("")) {
                        h += o13.l(2, this.name);
                    }
                    if (!this.icon.equals("")) {
                        h += o13.l(3, this.icon);
                    }
                    if (!this.message.equals("")) {
                        h += o13.l(4, this.message);
                    }
                    int i = this.state;
                    if (i != 0) {
                        h += o13.f(5, i);
                    }
                    long j2 = this.timeout;
                    if (j2 != 0) {
                        h += o13.h(6, j2);
                    }
                    return !this.appState.equals("") ? h + o13.l(7, this.appState) : h;
                }

                public void writeTo(o13 o13) throws IOException {
                    long j = this.appId;
                    if (j != 0) {
                        o13.x(1, j);
                    }
                    if (!this.name.equals("")) {
                        o13.E(2, this.name);
                    }
                    if (!this.icon.equals("")) {
                        o13.E(3, this.icon);
                    }
                    if (!this.message.equals("")) {
                        o13.E(4, this.message);
                    }
                    int i = this.state;
                    if (i != 0) {
                        o13.w(5, i);
                    }
                    long j2 = this.timeout;
                    if (j2 != 0) {
                        o13.x(6, j2);
                    }
                    if (!this.appState.equals("")) {
                        o13.E(7, this.appState);
                    }
                }

                public static App parseFrom(n13 n13) throws IOException {
                    return new App().mergeFrom(n13);
                }

                public App mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 8) {
                            this.appId = n13.q();
                        } else if (s == 18) {
                            this.name = n13.r();
                        } else if (s == 26) {
                            this.icon = n13.r();
                        } else if (s == 34) {
                            this.message = n13.r();
                        } else if (s == 40) {
                            this.state = n13.p();
                        } else if (s == 48) {
                            this.timeout = n13.q();
                        } else if (s == 58) {
                            this.appState = n13.r();
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Audio extends gr8 {
                public static final int FAILED = 3;
                public static final int NOT_SUPPORTED = 4;
                public static final int PROCESSING = 1;
                public static final int SUCCESS = 2;
                public static final int UNKNOWN = 0;
                private static volatile Audio[] _emptyArray;
                public long audioId;
                public long duration;
                public long lastStartTimeUpdateTimestamp;
                public long startTime;
                public String token;
                public String transcription;
                public int transcriptionStatus;
                public String url;
                public byte[] wave;

                public Audio() {
                    clear();
                }

                public static Audio[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Audio[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Audio parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Audio(), bArr);
                }

                public Audio clear() {
                    this.audioId = 0;
                    this.url = "";
                    this.duration = 0;
                    this.wave = iu7.o;
                    this.token = "";
                    this.startTime = 0;
                    this.lastStartTimeUpdateTimestamp = 0;
                    this.transcription = "";
                    this.transcriptionStatus = 0;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.audioId;
                    int h = j != 0 ? o13.h(1, j) : 0;
                    if (!this.url.equals("")) {
                        h += o13.l(2, this.url);
                    }
                    long j2 = this.duration;
                    if (j2 != 0) {
                        h += o13.h(3, j2);
                    }
                    if (!Arrays.equals(this.wave, iu7.o)) {
                        h += o13.b(4, this.wave);
                    }
                    if (!this.token.equals("")) {
                        h += o13.l(5, this.token);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        h += o13.h(6, j3);
                    }
                    long j4 = this.lastStartTimeUpdateTimestamp;
                    if (j4 != 0) {
                        h += o13.h(7, j4);
                    }
                    if (!this.transcription.equals("")) {
                        h += o13.l(8, this.transcription);
                    }
                    int i = this.transcriptionStatus;
                    return i != 0 ? h + o13.f(9, i) : h;
                }

                public void writeTo(o13 o13) throws IOException {
                    long j = this.audioId;
                    if (j != 0) {
                        o13.x(1, j);
                    }
                    if (!this.url.equals("")) {
                        o13.E(2, this.url);
                    }
                    long j2 = this.duration;
                    if (j2 != 0) {
                        o13.x(3, j2);
                    }
                    if (!Arrays.equals(this.wave, iu7.o)) {
                        o13.s(4, this.wave);
                    }
                    if (!this.token.equals("")) {
                        o13.E(5, this.token);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        o13.x(6, j3);
                    }
                    long j4 = this.lastStartTimeUpdateTimestamp;
                    if (j4 != 0) {
                        o13.x(7, j4);
                    }
                    if (!this.transcription.equals("")) {
                        o13.E(8, this.transcription);
                    }
                    int i = this.transcriptionStatus;
                    if (i != 0) {
                        o13.w(9, i);
                    }
                }

                public static Audio parseFrom(n13 n13) throws IOException {
                    return new Audio().mergeFrom(n13);
                }

                public Audio mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 8) {
                            this.audioId = n13.q();
                        } else if (s == 18) {
                            this.url = n13.r();
                        } else if (s == 24) {
                            this.duration = n13.q();
                        } else if (s == 34) {
                            this.wave = n13.g();
                        } else if (s == 42) {
                            this.token = n13.r();
                        } else if (s == 48) {
                            this.startTime = n13.q();
                        } else if (s == 56) {
                            this.lastStartTimeUpdateTimestamp = n13.q();
                        } else if (s == 66) {
                            this.transcription = n13.r();
                        } else if (s == 72) {
                            int p = n13.p();
                            if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4) {
                                this.transcriptionStatus = p;
                            }
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Button extends gr8 {
                public static final int CALLBACK = 0;
                public static final int CHAT = 5;
                public static final int DEFAULT = 0;
                public static final int LINK = 1;
                public static final int MESSAGE = 6;
                public static final int NEGATIVE = 2;
                public static final int OPEN_APP = 7;
                public static final int POSITIVE = 1;
                public static final int REQUEST_CONTACT = 2;
                public static final int REQUEST_GEO_LOCATION = 3;
                public static final int UNKNOWN_INTENT = 3;
                public static final int UNKNOWN_TYPE = 4;
                private static volatile Button[] _emptyArray;
                public long contactId;
                public int intent;
                public String payload;
                public boolean quickLocation;
                public boolean showLoading;
                public String title;
                public int type;
                public String url;

                public Button() {
                    clear();
                }

                public static Button[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Button[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Button parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Button(), bArr);
                }

                public Button clear() {
                    this.title = "";
                    this.type = 0;
                    this.intent = 0;
                    this.url = "";
                    this.payload = "";
                    this.showLoading = false;
                    this.quickLocation = false;
                    this.contactId = 0;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int l = !this.title.equals("") ? o13.l(1, this.title) : 0;
                    int i = this.type;
                    if (i != 0) {
                        l += o13.f(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        l += o13.f(3, i2);
                    }
                    if (!this.url.equals("")) {
                        l += o13.l(4, this.url);
                    }
                    if (!this.payload.equals("")) {
                        l += o13.l(5, this.payload);
                    }
                    if (this.showLoading) {
                        l += o13.a(6);
                    }
                    if (this.quickLocation) {
                        l += o13.a(7);
                    }
                    long j = this.contactId;
                    return j != 0 ? l + o13.h(8, j) : l;
                }

                public void writeTo(o13 o13) throws IOException {
                    if (!this.title.equals("")) {
                        o13.E(1, this.title);
                    }
                    int i = this.type;
                    if (i != 0) {
                        o13.w(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        o13.w(3, i2);
                    }
                    if (!this.url.equals("")) {
                        o13.E(4, this.url);
                    }
                    if (!this.payload.equals("")) {
                        o13.E(5, this.payload);
                    }
                    boolean z = this.showLoading;
                    if (z) {
                        o13.r(6, z);
                    }
                    boolean z2 = this.quickLocation;
                    if (z2) {
                        o13.r(7, z2);
                    }
                    long j = this.contactId;
                    if (j != 0) {
                        o13.x(8, j);
                    }
                }

                public static Button parseFrom(n13 n13) throws IOException {
                    return new Button().mergeFrom(n13);
                }

                public Button mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s != 10) {
                            if (s == 16) {
                                int p = n13.p();
                                switch (p) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        this.type = p;
                                        break;
                                }
                            } else if (s == 24) {
                                int p2 = n13.p();
                                if (p2 == 0 || p2 == 1 || p2 == 2 || p2 == 3) {
                                    this.intent = p2;
                                }
                            } else if (s == 34) {
                                this.url = n13.r();
                            } else if (s == 42) {
                                this.payload = n13.r();
                            } else if (s == 48) {
                                this.showLoading = n13.f();
                            } else if (s == 56) {
                                this.quickLocation = n13.f();
                            } else if (s == 64) {
                                this.contactId = n13.q();
                            } else if (!n13.u(s)) {
                                return this;
                            }
                        } else {
                            this.title = n13.r();
                        }
                    }
                }
            }

            public static final class Buttons extends gr8 {
                private static volatile Buttons[] _emptyArray;
                public Button[] button;

                public Buttons() {
                    clear();
                }

                public static Buttons[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Buttons[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Buttons parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Buttons(), bArr);
                }

                public Buttons clear() {
                    this.button = Button.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    Button[] buttonArr = this.button;
                    int i = 0;
                    if (buttonArr == null || buttonArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        gr8[] gr8Arr = this.button;
                        if (i >= gr8Arr.length) {
                            return i2;
                        }
                        gr8 gr8 = gr8Arr[i];
                        if (gr8 != null) {
                            i2 = o13.i(1, gr8) + i2;
                        }
                        i++;
                    }
                }

                public void writeTo(o13 o13) throws IOException {
                    Button[] buttonArr = this.button;
                    if (buttonArr != null && buttonArr.length > 0) {
                        int i = 0;
                        while (true) {
                            gr8[] gr8Arr = this.button;
                            if (i < gr8Arr.length) {
                                gr8 gr8 = gr8Arr[i];
                                if (gr8 != null) {
                                    o13.y(1, gr8);
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                }

                public static Buttons parseFrom(n13 n13) throws IOException {
                    return new Buttons().mergeFrom(n13);
                }

                public Buttons mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            int z = iu7.z(n13, 10);
                            Button[] buttonArr = this.button;
                            int length = buttonArr == null ? 0 : buttonArr.length;
                            int i = z + length;
                            Button[] buttonArr2 = new Button[i];
                            if (length != 0) {
                                System.arraycopy(buttonArr, 0, buttonArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Button button2 = new Button();
                                buttonArr2[length] = button2;
                                n13.j(button2);
                                n13.s();
                                length++;
                            }
                            Button button3 = new Button();
                            buttonArr2[length] = button3;
                            n13.j(button3);
                            this.button = buttonArr2;
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Call extends gr8 {
                public static final int AUDIO = 2;
                public static final int CANCELED = 2;
                public static final int HANGUP = 1;
                public static final int MISSED = 4;
                public static final int REJECTED = 3;
                public static final int UNKNOWN_CALL_TYPE = 0;
                public static final int UNKNOWN_HANGUP_TYPE = 0;
                public static final int VIDEO = 1;
                private static volatile Call[] _emptyArray;
                public int callType;
                public long[] contactIds;
                public String conversationId;
                public int duration;
                public long durationLong;
                public int hangupType;
                public String joinLink;

                public Call() {
                    clear();
                }

                public static Call[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Call[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Call parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Call(), bArr);
                }

                public Call clear() {
                    this.conversationId = "";
                    this.callType = 0;
                    this.hangupType = 0;
                    this.duration = 0;
                    this.contactIds = iu7.l;
                    this.durationLong = 0;
                    this.joinLink = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long[] jArr;
                    int i = 0;
                    int l = !this.conversationId.equals("") ? o13.l(1, this.conversationId) : 0;
                    int i2 = this.callType;
                    if (i2 != 0) {
                        l += o13.f(2, i2);
                    }
                    int i3 = this.hangupType;
                    if (i3 != 0) {
                        l += o13.f(3, i3);
                    }
                    int i4 = this.duration;
                    if (i4 != 0) {
                        l += o13.f(4, i4);
                    }
                    long[] jArr2 = this.contactIds;
                    if (jArr2 != null && jArr2.length > 0) {
                        int i5 = 0;
                        while (true) {
                            jArr = this.contactIds;
                            if (i >= jArr.length) {
                                break;
                            }
                            i5 += o13.k(jArr[i]);
                            i++;
                        }
                        l = l + i5 + jArr.length;
                    }
                    long j = this.durationLong;
                    if (j != 0) {
                        l += o13.h(6, j);
                    }
                    return !this.joinLink.equals("") ? l + o13.l(7, this.joinLink) : l;
                }

                public void writeTo(o13 o13) throws IOException {
                    if (!this.conversationId.equals("")) {
                        o13.E(1, this.conversationId);
                    }
                    int i = this.callType;
                    if (i != 0) {
                        o13.w(2, i);
                    }
                    int i2 = this.hangupType;
                    if (i2 != 0) {
                        o13.w(3, i2);
                    }
                    int i3 = this.duration;
                    if (i3 != 0) {
                        o13.w(4, i3);
                    }
                    long[] jArr = this.contactIds;
                    if (jArr != null && jArr.length > 0) {
                        int i4 = 0;
                        while (true) {
                            long[] jArr2 = this.contactIds;
                            if (i4 >= jArr2.length) {
                                break;
                            }
                            o13.x(5, jArr2[i4]);
                            i4++;
                        }
                    }
                    long j = this.durationLong;
                    if (j != 0) {
                        o13.x(6, j);
                    }
                    if (!this.joinLink.equals("")) {
                        o13.E(7, this.joinLink);
                    }
                }

                public static Call parseFrom(n13 n13) throws IOException {
                    return new Call().mergeFrom(n13);
                }

                public Call mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            this.conversationId = n13.r();
                        } else if (s == 16) {
                            int p = n13.p();
                            if (p == 0 || p == 1 || p == 2) {
                                this.callType = p;
                            }
                        } else if (s == 24) {
                            int p2 = n13.p();
                            if (p2 == 0 || p2 == 1 || p2 == 2 || p2 == 3 || p2 == 4) {
                                this.hangupType = p2;
                            }
                        } else if (s == 32) {
                            this.duration = n13.p();
                        } else if (s == 40) {
                            int z = iu7.z(n13, 40);
                            long[] jArr = this.contactIds;
                            int length = jArr == null ? 0 : jArr.length;
                            int i = z + length;
                            long[] jArr2 = new long[i];
                            if (length != 0) {
                                System.arraycopy(jArr, 0, jArr2, 0, length);
                            }
                            while (length < i - 1) {
                                jArr2[length] = n13.q();
                                n13.s();
                                length++;
                            }
                            jArr2[length] = n13.q();
                            this.contactIds = jArr2;
                        } else if (s == 42) {
                            int e = n13.e(n13.p());
                            int c = n13.c();
                            int i2 = 0;
                            while (n13.b() > 0) {
                                n13.q();
                                i2++;
                            }
                            n13.t(c);
                            long[] jArr3 = this.contactIds;
                            int length2 = jArr3 == null ? 0 : jArr3.length;
                            int i3 = i2 + length2;
                            long[] jArr4 = new long[i3];
                            if (length2 != 0) {
                                System.arraycopy(jArr3, 0, jArr4, 0, length2);
                            }
                            while (length2 < i3) {
                                jArr4[length2] = n13.q();
                                length2++;
                            }
                            this.contactIds = jArr4;
                            n13.d(e);
                        } else if (s == 48) {
                            this.durationLong = n13.q();
                        } else if (s == 58) {
                            this.joinLink = n13.r();
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Contact extends gr8 {
                private static volatile Contact[] _emptyArray;
                public long contactId;
                public String firstName;
                public String lastName;
                public String localPhotoUrl;
                public String name;
                public String phone;
                public String photoUrl;
                public String vcfBody;

                public Contact() {
                    clear();
                }

                public static Contact[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Contact[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Contact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Contact(), bArr);
                }

                public Contact clear() {
                    this.vcfBody = "";
                    this.contactId = 0;
                    this.name = "";
                    this.phone = "";
                    this.photoUrl = "";
                    this.localPhotoUrl = "";
                    this.firstName = "";
                    this.lastName = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int l = !this.vcfBody.equals("") ? o13.l(1, this.vcfBody) : 0;
                    long j = this.contactId;
                    if (j != 0) {
                        l += o13.h(2, j);
                    }
                    if (!this.name.equals("")) {
                        l += o13.l(3, this.name);
                    }
                    if (!this.phone.equals("")) {
                        l += o13.l(4, this.phone);
                    }
                    if (!this.photoUrl.equals("")) {
                        l += o13.l(5, this.photoUrl);
                    }
                    if (!this.localPhotoUrl.equals("")) {
                        l += o13.l(6, this.localPhotoUrl);
                    }
                    if (!this.firstName.equals("")) {
                        l += o13.l(7, this.firstName);
                    }
                    return !this.lastName.equals("") ? l + o13.l(8, this.lastName) : l;
                }

                public void writeTo(o13 o13) throws IOException {
                    if (!this.vcfBody.equals("")) {
                        o13.E(1, this.vcfBody);
                    }
                    long j = this.contactId;
                    if (j != 0) {
                        o13.x(2, j);
                    }
                    if (!this.name.equals("")) {
                        o13.E(3, this.name);
                    }
                    if (!this.phone.equals("")) {
                        o13.E(4, this.phone);
                    }
                    if (!this.photoUrl.equals("")) {
                        o13.E(5, this.photoUrl);
                    }
                    if (!this.localPhotoUrl.equals("")) {
                        o13.E(6, this.localPhotoUrl);
                    }
                    if (!this.firstName.equals("")) {
                        o13.E(7, this.firstName);
                    }
                    if (!this.lastName.equals("")) {
                        o13.E(8, this.lastName);
                    }
                }

                public static Contact parseFrom(n13 n13) throws IOException {
                    return new Contact().mergeFrom(n13);
                }

                public Contact mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            this.vcfBody = n13.r();
                        } else if (s == 16) {
                            this.contactId = n13.q();
                        } else if (s == 26) {
                            this.name = n13.r();
                        } else if (s == 34) {
                            this.phone = n13.r();
                        } else if (s == 42) {
                            this.photoUrl = n13.r();
                        } else if (s == 50) {
                            this.localPhotoUrl = n13.r();
                        } else if (s == 58) {
                            this.firstName = n13.r();
                        } else if (s == 66) {
                            this.lastName = n13.r();
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Control extends gr8 {
                public static final int ADD = 2;
                public static final int BOT_STARTED = 11;
                public static final int CHANNEL_TYPE = 2;
                public static final int CHAT_TYPE = 1;
                public static final int DIALOG = 4;
                public static final int GROUP_CHAT_TYPE = 3;
                public static final int HELLO = 7;
                public static final int ICON = 6;
                public static final int JOIN_BY_LINK = 9;
                public static final int LEAVE = 4;
                public static final int NEW = 1;
                public static final int PIN = 10;
                public static final int REMOVE = 3;
                public static final int SYSTEM = 8;
                public static final int TITLE = 5;
                public static final int UNKNOWN = 0;
                public static final int UNKNOWN_TYPE = 0;
                private static volatile Control[] _emptyArray;
                public int chatType;
                public Rect crop;
                public int event;
                public String fullUrl;
                public String iconToken;
                public String message;
                public long pinnedMessageId;
                public long pinnedMessageServerId;
                public String shortMessage;
                public boolean showHistory;
                public String startPayload;
                public String title;
                public String url;
                public long userId;
                public long[] userIds;

                public Control() {
                    clear();
                }

                public static Control[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Control[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Control parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Control(), bArr);
                }

                public Control clear() {
                    this.event = 0;
                    this.userId = 0;
                    this.userIds = iu7.l;
                    this.title = "";
                    this.iconToken = "";
                    this.url = "";
                    this.crop = null;
                    this.message = "";
                    this.shortMessage = "";
                    this.showHistory = false;
                    this.chatType = 0;
                    this.fullUrl = "";
                    this.pinnedMessageId = 0;
                    this.pinnedMessageServerId = 0;
                    this.startPayload = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long[] jArr;
                    int i = this.event;
                    int i2 = 0;
                    int f = i != 0 ? o13.f(1, i) : 0;
                    long j = this.userId;
                    if (j != 0) {
                        f += o13.h(2, j);
                    }
                    long[] jArr2 = this.userIds;
                    if (jArr2 != null && jArr2.length > 0) {
                        int i3 = 0;
                        while (true) {
                            jArr = this.userIds;
                            if (i2 >= jArr.length) {
                                break;
                            }
                            i3 += o13.k(jArr[i2]);
                            i2++;
                        }
                        f = f + i3 + jArr.length;
                    }
                    if (!this.title.equals("")) {
                        f += o13.l(4, this.title);
                    }
                    if (!this.iconToken.equals("")) {
                        f += o13.l(5, this.iconToken);
                    }
                    if (!this.url.equals("")) {
                        f += o13.l(6, this.url);
                    }
                    Rect rect = this.crop;
                    if (rect != null) {
                        f += o13.i(7, rect);
                    }
                    if (!this.message.equals("")) {
                        f += o13.l(8, this.message);
                    }
                    if (!this.shortMessage.equals("")) {
                        f += o13.l(9, this.shortMessage);
                    }
                    if (this.showHistory) {
                        f += o13.a(10);
                    }
                    int i4 = this.chatType;
                    if (i4 != 0) {
                        f += o13.f(11, i4);
                    }
                    if (!this.fullUrl.equals("")) {
                        f += o13.l(12, this.fullUrl);
                    }
                    long j2 = this.pinnedMessageId;
                    if (j2 != 0) {
                        f += o13.h(13, j2);
                    }
                    long j3 = this.pinnedMessageServerId;
                    if (j3 != 0) {
                        f += o13.h(14, j3);
                    }
                    return !this.startPayload.equals("") ? f + o13.l(16, this.startPayload) : f;
                }

                public void writeTo(o13 o13) throws IOException {
                    int i = this.event;
                    if (i != 0) {
                        o13.w(1, i);
                    }
                    long j = this.userId;
                    if (j != 0) {
                        o13.x(2, j);
                    }
                    long[] jArr = this.userIds;
                    if (jArr != null && jArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            long[] jArr2 = this.userIds;
                            if (i2 >= jArr2.length) {
                                break;
                            }
                            o13.x(3, jArr2[i2]);
                            i2++;
                        }
                    }
                    if (!this.title.equals("")) {
                        o13.E(4, this.title);
                    }
                    if (!this.iconToken.equals("")) {
                        o13.E(5, this.iconToken);
                    }
                    if (!this.url.equals("")) {
                        o13.E(6, this.url);
                    }
                    Rect rect = this.crop;
                    if (rect != null) {
                        o13.y(7, rect);
                    }
                    if (!this.message.equals("")) {
                        o13.E(8, this.message);
                    }
                    if (!this.shortMessage.equals("")) {
                        o13.E(9, this.shortMessage);
                    }
                    boolean z = this.showHistory;
                    if (z) {
                        o13.r(10, z);
                    }
                    int i3 = this.chatType;
                    if (i3 != 0) {
                        o13.w(11, i3);
                    }
                    if (!this.fullUrl.equals("")) {
                        o13.E(12, this.fullUrl);
                    }
                    long j2 = this.pinnedMessageId;
                    if (j2 != 0) {
                        o13.x(13, j2);
                    }
                    long j3 = this.pinnedMessageServerId;
                    if (j3 != 0) {
                        o13.x(14, j3);
                    }
                    if (!this.startPayload.equals("")) {
                        o13.E(16, this.startPayload);
                    }
                }

                public static Control parseFrom(n13 n13) throws IOException {
                    return new Control().mergeFrom(n13);
                }

                public Control mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        switch (s) {
                            case 0:
                                return this;
                            case 8:
                                int p = n13.p();
                                switch (p) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                        this.event = p;
                                        break;
                                }
                            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                                this.userId = n13.q();
                                break;
                            case 24:
                                int z = iu7.z(n13, 24);
                                long[] jArr = this.userIds;
                                int length = jArr == null ? 0 : jArr.length;
                                int i = z + length;
                                long[] jArr2 = new long[i];
                                if (length != 0) {
                                    System.arraycopy(jArr, 0, jArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    jArr2[length] = n13.q();
                                    n13.s();
                                    length++;
                                }
                                jArr2[length] = n13.q();
                                this.userIds = jArr2;
                                break;
                            case 26:
                                int e = n13.e(n13.p());
                                int c = n13.c();
                                int i2 = 0;
                                while (n13.b() > 0) {
                                    n13.q();
                                    i2++;
                                }
                                n13.t(c);
                                long[] jArr3 = this.userIds;
                                int length2 = jArr3 == null ? 0 : jArr3.length;
                                int i3 = i2 + length2;
                                long[] jArr4 = new long[i3];
                                if (length2 != 0) {
                                    System.arraycopy(jArr3, 0, jArr4, 0, length2);
                                }
                                while (length2 < i3) {
                                    jArr4[length2] = n13.q();
                                    length2++;
                                }
                                this.userIds = jArr4;
                                n13.d(e);
                                break;
                            case 34:
                                this.title = n13.r();
                                break;
                            case 42:
                                this.iconToken = n13.r();
                                break;
                            case 50:
                                this.url = n13.r();
                                break;
                            case 58:
                                if (this.crop == null) {
                                    this.crop = new Rect();
                                }
                                n13.j(this.crop);
                                break;
                            case 66:
                                this.message = n13.r();
                                break;
                            case 74:
                                this.shortMessage = n13.r();
                                break;
                            case 80:
                                this.showHistory = n13.f();
                                break;
                            case 88:
                                int p2 = n13.p();
                                if (p2 != 0 && p2 != 1 && p2 != 2 && p2 != 3 && p2 != 4) {
                                    break;
                                } else {
                                    this.chatType = p2;
                                    break;
                                }
                            case 98:
                                this.fullUrl = n13.r();
                                break;
                            case 104:
                                this.pinnedMessageId = n13.q();
                                break;
                            case 112:
                                this.pinnedMessageServerId = n13.q();
                                break;
                            case 130:
                                this.startPayload = n13.r();
                                break;
                            default:
                                if (n13.u(s)) {
                                    break;
                                } else {
                                    return this;
                                }
                        }
                    }
                }
            }

            public static final class File extends gr8 {
                private static volatile File[] _emptyArray;
                public long fileId;
                public String name;
                public Attach preview;
                public long size;
                public String token;

                public File() {
                    clear();
                }

                public static File[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new File[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static File parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new File(), bArr);
                }

                public File clear() {
                    this.fileId = 0;
                    this.size = 0;
                    this.name = "";
                    this.preview = null;
                    this.token = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.fileId;
                    int h = j != 0 ? o13.h(1, j) : 0;
                    long j2 = this.size;
                    if (j2 != 0) {
                        h += o13.h(2, j2);
                    }
                    if (!this.name.equals("")) {
                        h += o13.l(3, this.name);
                    }
                    Attach attach = this.preview;
                    if (attach != null) {
                        h += o13.i(4, attach);
                    }
                    return !this.token.equals("") ? h + o13.l(5, this.token) : h;
                }

                public void writeTo(o13 o13) throws IOException {
                    long j = this.fileId;
                    if (j != 0) {
                        o13.x(1, j);
                    }
                    long j2 = this.size;
                    if (j2 != 0) {
                        o13.x(2, j2);
                    }
                    if (!this.name.equals("")) {
                        o13.E(3, this.name);
                    }
                    Attach attach = this.preview;
                    if (attach != null) {
                        o13.y(4, attach);
                    }
                    if (!this.token.equals("")) {
                        o13.E(5, this.token);
                    }
                }

                public static File parseFrom(n13 n13) throws IOException {
                    return new File().mergeFrom(n13);
                }

                public File mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 8) {
                            this.fileId = n13.q();
                        } else if (s == 16) {
                            this.size = n13.q();
                        } else if (s == 26) {
                            this.name = n13.r();
                        } else if (s == 34) {
                            if (this.preview == null) {
                                this.preview = new Attach();
                            }
                            n13.j(this.preview);
                        } else if (s == 42) {
                            this.token = n13.r();
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class InlineKeyboard extends gr8 {
                private static volatile InlineKeyboard[] _emptyArray;
                public Buttons[] buttons;
                public String callbackId;

                public InlineKeyboard() {
                    clear();
                }

                public static InlineKeyboard[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new InlineKeyboard[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static InlineKeyboard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new InlineKeyboard(), bArr);
                }

                public InlineKeyboard clear() {
                    this.buttons = Buttons.emptyArray();
                    this.callbackId = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    Buttons[] buttonsArr = this.buttons;
                    int i = 0;
                    if (buttonsArr != null && buttonsArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            gr8[] gr8Arr = this.buttons;
                            if (i >= gr8Arr.length) {
                                break;
                            }
                            gr8 gr8 = gr8Arr[i];
                            if (gr8 != null) {
                                i2 = o13.i(1, gr8) + i2;
                            }
                            i++;
                        }
                        i = i2;
                    }
                    return !this.callbackId.equals("") ? i + o13.l(2, this.callbackId) : i;
                }

                public void writeTo(o13 o13) throws IOException {
                    Buttons[] buttonsArr = this.buttons;
                    if (buttonsArr != null && buttonsArr.length > 0) {
                        int i = 0;
                        while (true) {
                            gr8[] gr8Arr = this.buttons;
                            if (i >= gr8Arr.length) {
                                break;
                            }
                            gr8 gr8 = gr8Arr[i];
                            if (gr8 != null) {
                                o13.y(1, gr8);
                            }
                            i++;
                        }
                    }
                    if (!this.callbackId.equals("")) {
                        o13.E(2, this.callbackId);
                    }
                }

                public static InlineKeyboard parseFrom(n13 n13) throws IOException {
                    return new InlineKeyboard().mergeFrom(n13);
                }

                public InlineKeyboard mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            int z = iu7.z(n13, 10);
                            Buttons[] buttonsArr = this.buttons;
                            int length = buttonsArr == null ? 0 : buttonsArr.length;
                            int i = z + length;
                            Buttons[] buttonsArr2 = new Buttons[i];
                            if (length != 0) {
                                System.arraycopy(buttonsArr, 0, buttonsArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Buttons buttons2 = new Buttons();
                                buttonsArr2[length] = buttons2;
                                n13.j(buttons2);
                                n13.s();
                                length++;
                            }
                            Buttons buttons3 = new Buttons();
                            buttonsArr2[length] = buttons3;
                            n13.j(buttons3);
                            this.buttons = buttonsArr2;
                        } else if (s == 18) {
                            this.callbackId = n13.r();
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Location extends gr8 {
                private static volatile Location[] _emptyArray;
                public float accuracy;
                public double altitude;
                public float bearing;
                public boolean corrupted;
                public String deviceId;
                public long endTime;
                public LocationInfo lastLocation;
                public double latitude;
                public long livePeriod;
                public double longitude;
                public float speed;
                public long startTime;
                public LocationInfo[] track;
                public long ttl;
                public float zoom;

                public Location() {
                    clear();
                }

                public static Location[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Location[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Location(), bArr);
                }

                public Location clear() {
                    this.latitude = 0.0d;
                    this.longitude = 0.0d;
                    this.zoom = 0.0f;
                    this.ttl = 0;
                    this.livePeriod = 0;
                    this.track = LocationInfo.emptyArray();
                    this.deviceId = "";
                    this.lastLocation = null;
                    this.altitude = 0.0d;
                    this.accuracy = 0.0f;
                    this.bearing = 0.0f;
                    this.speed = 0.0f;
                    this.corrupted = false;
                    this.startTime = 0;
                    this.endTime = 0;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int i = 0;
                    int c = Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d) ? o13.c(1) : 0;
                    if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                        c += o13.c(2);
                    }
                    if (Float.floatToIntBits(this.zoom) != Float.floatToIntBits(0.0f)) {
                        c += o13.e(3);
                    }
                    long j = this.ttl;
                    if (j != 0) {
                        c += o13.h(4, j);
                    }
                    long j2 = this.livePeriod;
                    if (j2 != 0) {
                        c += o13.h(5, j2);
                    }
                    LocationInfo[] locationInfoArr = this.track;
                    if (locationInfoArr != null && locationInfoArr.length > 0) {
                        while (true) {
                            gr8[] gr8Arr = this.track;
                            if (i >= gr8Arr.length) {
                                break;
                            }
                            gr8 gr8 = gr8Arr[i];
                            if (gr8 != null) {
                                c = o13.i(6, gr8) + c;
                            }
                            i++;
                        }
                    }
                    if (!this.deviceId.equals("")) {
                        c += o13.l(7, this.deviceId);
                    }
                    LocationInfo locationInfo = this.lastLocation;
                    if (locationInfo != null) {
                        c += o13.i(8, locationInfo);
                    }
                    if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                        c += o13.c(9);
                    }
                    if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                        c += o13.e(10);
                    }
                    if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                        c += o13.e(11);
                    }
                    if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f)) {
                        c += o13.e(12);
                    }
                    if (this.corrupted) {
                        c += o13.a(13);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        c += o13.h(14, j3);
                    }
                    long j4 = this.endTime;
                    return j4 != 0 ? c + o13.h(15, j4) : c;
                }

                public void writeTo(o13 o13) throws IOException {
                    if (Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d)) {
                        o13.t(1, this.latitude);
                    }
                    if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                        o13.t(2, this.longitude);
                    }
                    if (Float.floatToIntBits(this.zoom) != Float.floatToIntBits(0.0f)) {
                        o13.v(3, this.zoom);
                    }
                    long j = this.ttl;
                    if (j != 0) {
                        o13.x(4, j);
                    }
                    long j2 = this.livePeriod;
                    if (j2 != 0) {
                        o13.x(5, j2);
                    }
                    LocationInfo[] locationInfoArr = this.track;
                    if (locationInfoArr != null && locationInfoArr.length > 0) {
                        int i = 0;
                        while (true) {
                            gr8[] gr8Arr = this.track;
                            if (i >= gr8Arr.length) {
                                break;
                            }
                            gr8 gr8 = gr8Arr[i];
                            if (gr8 != null) {
                                o13.y(6, gr8);
                            }
                            i++;
                        }
                    }
                    if (!this.deviceId.equals("")) {
                        o13.E(7, this.deviceId);
                    }
                    LocationInfo locationInfo = this.lastLocation;
                    if (locationInfo != null) {
                        o13.y(8, locationInfo);
                    }
                    if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                        o13.t(9, this.altitude);
                    }
                    if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                        o13.v(10, this.accuracy);
                    }
                    if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                        o13.v(11, this.bearing);
                    }
                    if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f)) {
                        o13.v(12, this.speed);
                    }
                    boolean z = this.corrupted;
                    if (z) {
                        o13.r(13, z);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        o13.x(14, j3);
                    }
                    long j4 = this.endTime;
                    if (j4 != 0) {
                        o13.x(15, j4);
                    }
                }

                public static Location parseFrom(n13 n13) throws IOException {
                    return new Location().mergeFrom(n13);
                }

                public Location mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        switch (s) {
                            case 0:
                                return this;
                            case 9:
                                this.latitude = n13.h();
                                break;
                            case LangUtils.HASH_SEED:
                                this.longitude = n13.h();
                                break;
                            case 29:
                                this.zoom = n13.i();
                                break;
                            case 32:
                                this.ttl = n13.q();
                                break;
                            case 40:
                                this.livePeriod = n13.q();
                                break;
                            case 50:
                                int z = iu7.z(n13, 50);
                                LocationInfo[] locationInfoArr = this.track;
                                int length = locationInfoArr == null ? 0 : locationInfoArr.length;
                                int i = z + length;
                                LocationInfo[] locationInfoArr2 = new LocationInfo[i];
                                if (length != 0) {
                                    System.arraycopy(locationInfoArr, 0, locationInfoArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    LocationInfo locationInfo = new LocationInfo();
                                    locationInfoArr2[length] = locationInfo;
                                    n13.j(locationInfo);
                                    n13.s();
                                    length++;
                                }
                                LocationInfo locationInfo2 = new LocationInfo();
                                locationInfoArr2[length] = locationInfo2;
                                n13.j(locationInfo2);
                                this.track = locationInfoArr2;
                                break;
                            case 58:
                                this.deviceId = n13.r();
                                break;
                            case 66:
                                if (this.lastLocation == null) {
                                    this.lastLocation = new LocationInfo();
                                }
                                n13.j(this.lastLocation);
                                break;
                            case 73:
                                this.altitude = n13.h();
                                break;
                            case 85:
                                this.accuracy = n13.i();
                                break;
                            case 93:
                                this.bearing = n13.i();
                                break;
                            case HttpStatus.SC_SWITCHING_PROTOCOLS:
                                this.speed = n13.i();
                                break;
                            case 104:
                                this.corrupted = n13.f();
                                break;
                            case 112:
                                this.startTime = n13.q();
                                break;
                            case 120:
                                this.endTime = n13.q();
                                break;
                            default:
                                if (n13.u(s)) {
                                    break;
                                } else {
                                    return this;
                                }
                        }
                    }
                }
            }

            public static final class Photo extends gr8 {
                private static volatile Photo[] _emptyArray;
                public String baseUrl;
                public String externalGifId;
                public boolean gif;
                public int height;
                public String mp4Url;
                public long photoId;
                public String photoToken;
                public String photoUrl;
                public byte[] previewData;
                public String previewUrl;
                public int width;

                public Photo() {
                    clear();
                }

                public static Photo[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Photo[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Photo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Photo(), bArr);
                }

                public Photo clear() {
                    this.photoUrl = "";
                    this.width = 0;
                    this.height = 0;
                    this.gif = false;
                    this.previewData = iu7.o;
                    this.photoToken = "";
                    this.photoId = 0;
                    this.mp4Url = "";
                    this.baseUrl = "";
                    this.externalGifId = "";
                    this.previewUrl = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int l = !this.photoUrl.equals("") ? o13.l(1, this.photoUrl) : 0;
                    int i = this.width;
                    if (i != 0) {
                        l += o13.f(2, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        l += o13.f(3, i2);
                    }
                    if (this.gif) {
                        l += o13.a(4);
                    }
                    if (!Arrays.equals(this.previewData, iu7.o)) {
                        l += o13.b(5, this.previewData);
                    }
                    if (!this.photoToken.equals("")) {
                        l += o13.l(6, this.photoToken);
                    }
                    long j = this.photoId;
                    if (j != 0) {
                        l += o13.h(7, j);
                    }
                    if (!this.mp4Url.equals("")) {
                        l += o13.l(8, this.mp4Url);
                    }
                    if (!this.baseUrl.equals("")) {
                        l += o13.l(10, this.baseUrl);
                    }
                    if (!this.externalGifId.equals("")) {
                        l += o13.l(11, this.externalGifId);
                    }
                    return !this.previewUrl.equals("") ? l + o13.l(12, this.previewUrl) : l;
                }

                public void writeTo(o13 o13) throws IOException {
                    if (!this.photoUrl.equals("")) {
                        o13.E(1, this.photoUrl);
                    }
                    int i = this.width;
                    if (i != 0) {
                        o13.w(2, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        o13.w(3, i2);
                    }
                    boolean z = this.gif;
                    if (z) {
                        o13.r(4, z);
                    }
                    if (!Arrays.equals(this.previewData, iu7.o)) {
                        o13.s(5, this.previewData);
                    }
                    if (!this.photoToken.equals("")) {
                        o13.E(6, this.photoToken);
                    }
                    long j = this.photoId;
                    if (j != 0) {
                        o13.x(7, j);
                    }
                    if (!this.mp4Url.equals("")) {
                        o13.E(8, this.mp4Url);
                    }
                    if (!this.baseUrl.equals("")) {
                        o13.E(10, this.baseUrl);
                    }
                    if (!this.externalGifId.equals("")) {
                        o13.E(11, this.externalGifId);
                    }
                    if (!this.previewUrl.equals("")) {
                        o13.E(12, this.previewUrl);
                    }
                }

                public static Photo parseFrom(n13 n13) throws IOException {
                    return new Photo().mergeFrom(n13);
                }

                public Photo mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        switch (s) {
                            case 0:
                                return this;
                            case 10:
                                this.photoUrl = n13.r();
                                break;
                            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                                this.width = n13.p();
                                break;
                            case 24:
                                this.height = n13.p();
                                break;
                            case 32:
                                this.gif = n13.f();
                                break;
                            case 42:
                                this.previewData = n13.g();
                                break;
                            case 50:
                                this.photoToken = n13.r();
                                break;
                            case 56:
                                this.photoId = n13.q();
                                break;
                            case 66:
                                this.mp4Url = n13.r();
                                break;
                            case 82:
                                this.baseUrl = n13.r();
                                break;
                            case 90:
                                this.externalGifId = n13.r();
                                break;
                            case 98:
                                this.previewUrl = n13.r();
                                break;
                            default:
                                if (n13.u(s)) {
                                    break;
                                } else {
                                    return this;
                                }
                        }
                    }
                }
            }

            public static final class Present extends gr8 {
                public static final int ACCEPTED = 3;
                public static final int ACCEPTING = 5;
                public static final int DECLINED = 4;
                public static final int NEW = 1;
                public static final int RECEIVED = 2;
                public static final int UNKNOWN = 0;
                private static volatile Present[] _emptyArray;
                public long metadataId;
                public long presentId;
                public String presentJson;
                public long receiverId;
                public long senderId;
                public int status;

                public Present() {
                    clear();
                }

                public static Present[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Present[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Present parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Present(), bArr);
                }

                public Present clear() {
                    this.presentId = 0;
                    this.metadataId = 0;
                    this.senderId = 0;
                    this.receiverId = 0;
                    this.status = 0;
                    this.presentJson = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.presentId;
                    int h = j != 0 ? o13.h(1, j) : 0;
                    long j2 = this.metadataId;
                    if (j2 != 0) {
                        h += o13.h(2, j2);
                    }
                    long j3 = this.senderId;
                    if (j3 != 0) {
                        h += o13.h(3, j3);
                    }
                    long j4 = this.receiverId;
                    if (j4 != 0) {
                        h += o13.h(4, j4);
                    }
                    int i = this.status;
                    if (i != 0) {
                        h += o13.f(5, i);
                    }
                    return !this.presentJson.equals("") ? h + o13.l(6, this.presentJson) : h;
                }

                public void writeTo(o13 o13) throws IOException {
                    long j = this.presentId;
                    if (j != 0) {
                        o13.x(1, j);
                    }
                    long j2 = this.metadataId;
                    if (j2 != 0) {
                        o13.x(2, j2);
                    }
                    long j3 = this.senderId;
                    if (j3 != 0) {
                        o13.x(3, j3);
                    }
                    long j4 = this.receiverId;
                    if (j4 != 0) {
                        o13.x(4, j4);
                    }
                    int i = this.status;
                    if (i != 0) {
                        o13.w(5, i);
                    }
                    if (!this.presentJson.equals("")) {
                        o13.E(6, this.presentJson);
                    }
                }

                public static Present parseFrom(n13 n13) throws IOException {
                    return new Present().mergeFrom(n13);
                }

                public Present mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 8) {
                            this.presentId = n13.q();
                        } else if (s == 16) {
                            this.metadataId = n13.q();
                        } else if (s == 24) {
                            this.senderId = n13.q();
                        } else if (s == 32) {
                            this.receiverId = n13.q();
                        } else if (s == 40) {
                            int p = n13.p();
                            if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4 || p == 5) {
                                this.status = p;
                            }
                        } else if (s == 50) {
                            this.presentJson = n13.r();
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Rect extends gr8 {
                private static volatile Rect[] _emptyArray;
                public float bottom;
                public float left;
                public float right;
                public float top;

                public Rect() {
                    clear();
                }

                public static Rect[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Rect[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Rect parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Rect(), bArr);
                }

                public Rect clear() {
                    this.left = 0.0f;
                    this.top = 0.0f;
                    this.right = 0.0f;
                    this.bottom = 0.0f;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int e = Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f) ? o13.e(1) : 0;
                    if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                        e += o13.e(2);
                    }
                    if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                        e += o13.e(3);
                    }
                    return Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f) ? e + o13.e(4) : e;
                }

                public void writeTo(o13 o13) throws IOException {
                    if (Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f)) {
                        o13.v(1, this.left);
                    }
                    if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                        o13.v(2, this.top);
                    }
                    if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                        o13.v(3, this.right);
                    }
                    if (Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f)) {
                        o13.v(4, this.bottom);
                    }
                }

                public static Rect parseFrom(n13 n13) throws IOException {
                    return new Rect().mergeFrom(n13);
                }

                public Rect mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 13) {
                            this.left = n13.i();
                        } else if (s == 21) {
                            this.top = n13.i();
                        } else if (s == 29) {
                            this.right = n13.i();
                        } else if (s == 37) {
                            this.bottom = n13.i();
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class ReplyButton extends gr8 {
                public static final int CONTACT = 2;
                public static final int DEFAULT = 0;
                public static final int IMAGE = 1;
                public static final int LOCATION = 3;
                public static final int MESSAGE = 0;
                public static final int NEGATIVE = 2;
                public static final int POSITIVE = 1;
                public static final int UNKNOWN = 4;
                public static final int UNKNOWN_INTENT = 3;
                private static volatile ReplyButton[] _emptyArray;
                public Photo image;
                public int intent;
                public long outgoingMessageId;
                public String text;
                public int type;

                public ReplyButton() {
                    clear();
                }

                public static ReplyButton[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyButton[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyButton parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new ReplyButton(), bArr);
                }

                public ReplyButton clear() {
                    this.text = "";
                    this.type = 0;
                    this.intent = 0;
                    this.image = null;
                    this.outgoingMessageId = 0;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int l = !this.text.equals("") ? o13.l(1, this.text) : 0;
                    int i = this.type;
                    if (i != 0) {
                        l += o13.f(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        l += o13.f(3, i2);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        l += o13.i(4, photo);
                    }
                    long j = this.outgoingMessageId;
                    return j != 0 ? l + o13.h(5, j) : l;
                }

                public void writeTo(o13 o13) throws IOException {
                    if (!this.text.equals("")) {
                        o13.E(1, this.text);
                    }
                    int i = this.type;
                    if (i != 0) {
                        o13.w(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        o13.w(3, i2);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        o13.y(4, photo);
                    }
                    long j = this.outgoingMessageId;
                    if (j != 0) {
                        o13.x(5, j);
                    }
                }

                public static ReplyButton parseFrom(n13 n13) throws IOException {
                    return new ReplyButton().mergeFrom(n13);
                }

                public ReplyButton mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            this.text = n13.r();
                        } else if (s == 16) {
                            int p = n13.p();
                            if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4) {
                                this.type = p;
                            }
                        } else if (s == 24) {
                            int p2 = n13.p();
                            if (p2 == 0 || p2 == 1 || p2 == 2 || p2 == 3) {
                                this.intent = p2;
                            }
                        } else if (s == 34) {
                            if (this.image == null) {
                                this.image = new Photo();
                            }
                            n13.j(this.image);
                        } else if (s == 40) {
                            this.outgoingMessageId = n13.q();
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class ReplyButtons extends gr8 {
                private static volatile ReplyButtons[] _emptyArray;
                public ReplyButton[] replyButton;

                public ReplyButtons() {
                    clear();
                }

                public static ReplyButtons[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyButtons[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyButtons parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new ReplyButtons(), bArr);
                }

                public ReplyButtons clear() {
                    this.replyButton = ReplyButton.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    ReplyButton[] replyButtonArr = this.replyButton;
                    int i = 0;
                    if (replyButtonArr == null || replyButtonArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        gr8[] gr8Arr = this.replyButton;
                        if (i >= gr8Arr.length) {
                            return i2;
                        }
                        gr8 gr8 = gr8Arr[i];
                        if (gr8 != null) {
                            i2 = o13.i(1, gr8) + i2;
                        }
                        i++;
                    }
                }

                public void writeTo(o13 o13) throws IOException {
                    ReplyButton[] replyButtonArr = this.replyButton;
                    if (replyButtonArr != null && replyButtonArr.length > 0) {
                        int i = 0;
                        while (true) {
                            gr8[] gr8Arr = this.replyButton;
                            if (i < gr8Arr.length) {
                                gr8 gr8 = gr8Arr[i];
                                if (gr8 != null) {
                                    o13.y(1, gr8);
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                }

                public static ReplyButtons parseFrom(n13 n13) throws IOException {
                    return new ReplyButtons().mergeFrom(n13);
                }

                public ReplyButtons mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            int z = iu7.z(n13, 10);
                            ReplyButton[] replyButtonArr = this.replyButton;
                            int length = replyButtonArr == null ? 0 : replyButtonArr.length;
                            int i = z + length;
                            ReplyButton[] replyButtonArr2 = new ReplyButton[i];
                            if (length != 0) {
                                System.arraycopy(replyButtonArr, 0, replyButtonArr2, 0, length);
                            }
                            while (length < i - 1) {
                                ReplyButton replyButton2 = new ReplyButton();
                                replyButtonArr2[length] = replyButton2;
                                n13.j(replyButton2);
                                n13.s();
                                length++;
                            }
                            ReplyButton replyButton3 = new ReplyButton();
                            replyButtonArr2[length] = replyButton3;
                            n13.j(replyButton3);
                            this.replyButton = replyButtonArr2;
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class ReplyKeyboard extends gr8 {
                private static volatile ReplyKeyboard[] _emptyArray;
                public ReplyButtons[] buttons;
                public boolean defaultInputDisabled;

                public ReplyKeyboard() {
                    clear();
                }

                public static ReplyKeyboard[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyKeyboard[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyKeyboard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new ReplyKeyboard(), bArr);
                }

                public ReplyKeyboard clear() {
                    this.buttons = ReplyButtons.emptyArray();
                    this.defaultInputDisabled = false;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    ReplyButtons[] replyButtonsArr = this.buttons;
                    int i = 0;
                    if (replyButtonsArr != null && replyButtonsArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            gr8[] gr8Arr = this.buttons;
                            if (i >= gr8Arr.length) {
                                break;
                            }
                            gr8 gr8 = gr8Arr[i];
                            if (gr8 != null) {
                                i2 = o13.i(1, gr8) + i2;
                            }
                            i++;
                        }
                        i = i2;
                    }
                    return this.defaultInputDisabled ? i + o13.a(2) : i;
                }

                public void writeTo(o13 o13) throws IOException {
                    ReplyButtons[] replyButtonsArr = this.buttons;
                    if (replyButtonsArr != null && replyButtonsArr.length > 0) {
                        int i = 0;
                        while (true) {
                            gr8[] gr8Arr = this.buttons;
                            if (i >= gr8Arr.length) {
                                break;
                            }
                            gr8 gr8 = gr8Arr[i];
                            if (gr8 != null) {
                                o13.y(1, gr8);
                            }
                            i++;
                        }
                    }
                    boolean z = this.defaultInputDisabled;
                    if (z) {
                        o13.r(2, z);
                    }
                }

                public static ReplyKeyboard parseFrom(n13 n13) throws IOException {
                    return new ReplyKeyboard().mergeFrom(n13);
                }

                public ReplyKeyboard mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            int z = iu7.z(n13, 10);
                            ReplyButtons[] replyButtonsArr = this.buttons;
                            int length = replyButtonsArr == null ? 0 : replyButtonsArr.length;
                            int i = z + length;
                            ReplyButtons[] replyButtonsArr2 = new ReplyButtons[i];
                            if (length != 0) {
                                System.arraycopy(replyButtonsArr, 0, replyButtonsArr2, 0, length);
                            }
                            while (length < i - 1) {
                                ReplyButtons replyButtons = new ReplyButtons();
                                replyButtonsArr2[length] = replyButtons;
                                n13.j(replyButtons);
                                n13.s();
                                length++;
                            }
                            ReplyButtons replyButtons2 = new ReplyButtons();
                            replyButtonsArr2[length] = replyButtons2;
                            n13.j(replyButtons2);
                            this.buttons = replyButtonsArr2;
                        } else if (s == 16) {
                            this.defaultInputDisabled = n13.f();
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class SendAction extends gr8 {
                private static volatile SendAction[] _emptyArray;
                public String actionDestinationType;
                public String backgroundColor;
                public String contentType;
                public String context;
                public String nextContentType;
                public String textColor;
                public String title;

                public SendAction() {
                    clear();
                }

                public static SendAction[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new SendAction[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static SendAction parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new SendAction(), bArr);
                }

                public SendAction clear() {
                    this.contentType = "";
                    this.title = "";
                    this.nextContentType = "";
                    this.textColor = "";
                    this.backgroundColor = "";
                    this.context = "";
                    this.actionDestinationType = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int l = !this.contentType.equals("") ? o13.l(1, this.contentType) : 0;
                    if (!this.title.equals("")) {
                        l += o13.l(2, this.title);
                    }
                    if (!this.nextContentType.equals("")) {
                        l += o13.l(3, this.nextContentType);
                    }
                    if (!this.textColor.equals("")) {
                        l += o13.l(4, this.textColor);
                    }
                    if (!this.backgroundColor.equals("")) {
                        l += o13.l(5, this.backgroundColor);
                    }
                    if (!this.context.equals("")) {
                        l += o13.l(6, this.context);
                    }
                    return !this.actionDestinationType.equals("") ? l + o13.l(7, this.actionDestinationType) : l;
                }

                public void writeTo(o13 o13) throws IOException {
                    if (!this.contentType.equals("")) {
                        o13.E(1, this.contentType);
                    }
                    if (!this.title.equals("")) {
                        o13.E(2, this.title);
                    }
                    if (!this.nextContentType.equals("")) {
                        o13.E(3, this.nextContentType);
                    }
                    if (!this.textColor.equals("")) {
                        o13.E(4, this.textColor);
                    }
                    if (!this.backgroundColor.equals("")) {
                        o13.E(5, this.backgroundColor);
                    }
                    if (!this.context.equals("")) {
                        o13.E(6, this.context);
                    }
                    if (!this.actionDestinationType.equals("")) {
                        o13.E(7, this.actionDestinationType);
                    }
                }

                public static SendAction parseFrom(n13 n13) throws IOException {
                    return new SendAction().mergeFrom(n13);
                }

                public SendAction mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            this.contentType = n13.r();
                        } else if (s == 18) {
                            this.title = n13.r();
                        } else if (s == 26) {
                            this.nextContentType = n13.r();
                        } else if (s == 34) {
                            this.textColor = n13.r();
                        } else if (s == 42) {
                            this.backgroundColor = n13.r();
                        } else if (s == 50) {
                            this.context = n13.r();
                        } else if (s == 58) {
                            this.actionDestinationType = n13.r();
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Share extends gr8 {
                private static volatile Share[] _emptyArray;
                public boolean deleted;
                public String description;
                public String host;
                public Photo image;
                public Attach media;
                public long shareId;
                public String title;
                public String token;
                public String url;

                public Share() {
                    clear();
                }

                public static Share[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Share[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Share parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Share(), bArr);
                }

                public Share clear() {
                    this.shareId = 0;
                    this.token = "";
                    this.url = "";
                    this.title = "";
                    this.description = "";
                    this.host = "";
                    this.image = null;
                    this.media = null;
                    this.deleted = false;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.shareId;
                    int h = j != 0 ? o13.h(1, j) : 0;
                    if (!this.token.equals("")) {
                        h += o13.l(2, this.token);
                    }
                    if (!this.url.equals("")) {
                        h += o13.l(3, this.url);
                    }
                    if (!this.title.equals("")) {
                        h += o13.l(4, this.title);
                    }
                    if (!this.description.equals("")) {
                        h += o13.l(5, this.description);
                    }
                    if (!this.host.equals("")) {
                        h += o13.l(6, this.host);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        h += o13.i(7, photo);
                    }
                    Attach attach = this.media;
                    if (attach != null) {
                        h += o13.i(8, attach);
                    }
                    return this.deleted ? h + o13.a(9) : h;
                }

                public void writeTo(o13 o13) throws IOException {
                    long j = this.shareId;
                    if (j != 0) {
                        o13.x(1, j);
                    }
                    if (!this.token.equals("")) {
                        o13.E(2, this.token);
                    }
                    if (!this.url.equals("")) {
                        o13.E(3, this.url);
                    }
                    if (!this.title.equals("")) {
                        o13.E(4, this.title);
                    }
                    if (!this.description.equals("")) {
                        o13.E(5, this.description);
                    }
                    if (!this.host.equals("")) {
                        o13.E(6, this.host);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        o13.y(7, photo);
                    }
                    Attach attach = this.media;
                    if (attach != null) {
                        o13.y(8, attach);
                    }
                    boolean z = this.deleted;
                    if (z) {
                        o13.r(9, z);
                    }
                }

                public static Share parseFrom(n13 n13) throws IOException {
                    return new Share().mergeFrom(n13);
                }

                public Share mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 8) {
                            this.shareId = n13.q();
                        } else if (s == 18) {
                            this.token = n13.r();
                        } else if (s == 26) {
                            this.url = n13.r();
                        } else if (s == 34) {
                            this.title = n13.r();
                        } else if (s == 42) {
                            this.description = n13.r();
                        } else if (s == 50) {
                            this.host = n13.r();
                        } else if (s == 58) {
                            if (this.image == null) {
                                this.image = new Photo();
                            }
                            n13.j(this.image);
                        } else if (s == 66) {
                            if (this.media == null) {
                                this.media = new Attach();
                            }
                            n13.j(this.media);
                        } else if (s == 72) {
                            this.deleted = n13.f();
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Sticker extends gr8 {
                public static final int LIVE = 2;
                public static final int LOTTIE = 4;
                public static final int POSTCARD = 3;
                public static final int STATIC = 1;
                public static final int SYSTEM = 1;
                public static final int UNKNOWN = 0;
                public static final int UNKNOWN_TYPE = 0;
                public static final int USER = 2;
                private static volatile Sticker[] _emptyArray;
                public boolean audio;
                public int authorType;
                public String firstUrl;
                public int height;
                public String lottieUrl;
                public String mp4Url;
                public String previewUrl;
                public long setId;
                public long stickerId;
                public int stickerType;
                public String[] tags;
                public long updateTime;
                public String url;
                public String videoUrl;
                public int width;

                public static final class AnimationProperties extends gr8 {
                    private static volatile AnimationProperties[] _emptyArray;
                    public int duration;
                    public int fps;
                    public Map<Integer, Integer> frameRepeats;
                    public int framesCount;
                    public int replayDelay;

                    public AnimationProperties() {
                        clear();
                    }

                    public static AnimationProperties[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (tz6.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new AnimationProperties[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static AnimationProperties parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return gr8.mergeFrom(new AnimationProperties(), bArr);
                    }

                    public AnimationProperties clear() {
                        this.framesCount = 0;
                        this.fps = 0;
                        this.duration = 0;
                        this.replayDelay = 0;
                        this.frameRepeats = null;
                        this.cachedSize = -1;
                        return this;
                    }

                    public int computeSerializedSize() {
                        int i = this.framesCount;
                        int f = i != 0 ? o13.f(1, i) : 0;
                        int i2 = this.fps;
                        if (i2 != 0) {
                            f += o13.f(2, i2);
                        }
                        int i3 = this.duration;
                        if (i3 != 0) {
                            f += o13.f(3, i3);
                        }
                        int i4 = this.replayDelay;
                        if (i4 != 0) {
                            f += o13.f(4, i4);
                        }
                        Map<Integer, Integer> map = this.frameRepeats;
                        return map != null ? f + tz6.a(map, 5, 5, 5) : f;
                    }

                    public AnimationProperties mergeFrom(n13 n13) throws IOException {
                        mt7 mt7 = xy6.d;
                        while (true) {
                            int s = n13.s();
                            if (s == 0) {
                                return this;
                            }
                            if (s == 8) {
                                this.framesCount = n13.p();
                            } else if (s == 16) {
                                this.fps = n13.p();
                            } else if (s == 24) {
                                this.duration = n13.p();
                            } else if (s == 32) {
                                this.replayDelay = n13.p();
                            } else if (s == 42) {
                                this.frameRepeats = tz6.b(n13, this.frameRepeats, mt7, 5, 5, (gr8) null, 8, 16);
                            } else if (!n13.u(s)) {
                                return this;
                            }
                        }
                    }

                    public void writeTo(o13 o13) throws IOException {
                        int i = this.framesCount;
                        if (i != 0) {
                            o13.w(1, i);
                        }
                        int i2 = this.fps;
                        if (i2 != 0) {
                            o13.w(2, i2);
                        }
                        int i3 = this.duration;
                        if (i3 != 0) {
                            o13.w(3, i3);
                        }
                        int i4 = this.replayDelay;
                        if (i4 != 0) {
                            o13.w(4, i4);
                        }
                        Map<Integer, Integer> map = this.frameRepeats;
                        if (map != null) {
                            tz6.d(o13, map, 5, 5, 5);
                        }
                    }

                    public static AnimationProperties parseFrom(n13 n13) throws IOException {
                        return new AnimationProperties().mergeFrom(n13);
                    }
                }

                public Sticker() {
                    clear();
                }

                public static Sticker[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Sticker[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Sticker parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Sticker(), bArr);
                }

                public Sticker clear() {
                    this.stickerId = 0;
                    this.url = "";
                    this.width = 0;
                    this.height = 0;
                    this.mp4Url = "";
                    this.firstUrl = "";
                    this.tags = iu7.n;
                    this.previewUrl = "";
                    this.updateTime = 0;
                    this.stickerType = 0;
                    this.setId = 0;
                    this.lottieUrl = "";
                    this.audio = false;
                    this.authorType = 0;
                    this.videoUrl = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.stickerId;
                    int i = 0;
                    int h = j != 0 ? o13.h(1, j) : 0;
                    if (!this.url.equals("")) {
                        h += o13.l(2, this.url);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        h += o13.f(3, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        h += o13.f(4, i3);
                    }
                    if (!this.mp4Url.equals("")) {
                        h += o13.l(5, this.mp4Url);
                    }
                    if (!this.firstUrl.equals("")) {
                        h += o13.l(6, this.firstUrl);
                    }
                    String[] strArr = this.tags;
                    if (strArr != null && strArr.length > 0) {
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            String[] strArr2 = this.tags;
                            if (i >= strArr2.length) {
                                break;
                            }
                            String str = strArr2[i];
                            if (str != null) {
                                i5++;
                                int q = o13.q(str);
                                i4 = o13.j(q) + q + i4;
                            }
                            i++;
                        }
                        h = h + i4 + i5;
                    }
                    if (!this.previewUrl.equals("")) {
                        h += o13.l(9, this.previewUrl);
                    }
                    long j2 = this.updateTime;
                    if (j2 != 0) {
                        h += o13.h(10, j2);
                    }
                    int i6 = this.stickerType;
                    if (i6 != 0) {
                        h += o13.f(13, i6);
                    }
                    long j3 = this.setId;
                    if (j3 != 0) {
                        h += o13.h(15, j3);
                    }
                    if (!this.lottieUrl.equals("")) {
                        h += o13.l(16, this.lottieUrl);
                    }
                    if (this.audio) {
                        h += o13.a(17);
                    }
                    int i7 = this.authorType;
                    if (i7 != 0) {
                        h += o13.f(18, i7);
                    }
                    return !this.videoUrl.equals("") ? h + o13.l(20, this.videoUrl) : h;
                }

                public void writeTo(o13 o13) throws IOException {
                    long j = this.stickerId;
                    if (j != 0) {
                        o13.x(1, j);
                    }
                    if (!this.url.equals("")) {
                        o13.E(2, this.url);
                    }
                    int i = this.width;
                    if (i != 0) {
                        o13.w(3, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        o13.w(4, i2);
                    }
                    if (!this.mp4Url.equals("")) {
                        o13.E(5, this.mp4Url);
                    }
                    if (!this.firstUrl.equals("")) {
                        o13.E(6, this.firstUrl);
                    }
                    String[] strArr = this.tags;
                    if (strArr != null && strArr.length > 0) {
                        int i3 = 0;
                        while (true) {
                            String[] strArr2 = this.tags;
                            if (i3 >= strArr2.length) {
                                break;
                            }
                            String str = strArr2[i3];
                            if (str != null) {
                                o13.E(8, str);
                            }
                            i3++;
                        }
                    }
                    if (!this.previewUrl.equals("")) {
                        o13.E(9, this.previewUrl);
                    }
                    long j2 = this.updateTime;
                    if (j2 != 0) {
                        o13.x(10, j2);
                    }
                    int i4 = this.stickerType;
                    if (i4 != 0) {
                        o13.w(13, i4);
                    }
                    long j3 = this.setId;
                    if (j3 != 0) {
                        o13.x(15, j3);
                    }
                    if (!this.lottieUrl.equals("")) {
                        o13.E(16, this.lottieUrl);
                    }
                    boolean z = this.audio;
                    if (z) {
                        o13.r(17, z);
                    }
                    int i5 = this.authorType;
                    if (i5 != 0) {
                        o13.w(18, i5);
                    }
                    if (!this.videoUrl.equals("")) {
                        o13.E(20, this.videoUrl);
                    }
                }

                public static Sticker parseFrom(n13 n13) throws IOException {
                    return new Sticker().mergeFrom(n13);
                }

                public Sticker mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        switch (s) {
                            case 0:
                                return this;
                            case 8:
                                this.stickerId = n13.q();
                                break;
                            case 18:
                                this.url = n13.r();
                                break;
                            case 24:
                                this.width = n13.p();
                                break;
                            case 32:
                                this.height = n13.p();
                                break;
                            case 42:
                                this.mp4Url = n13.r();
                                break;
                            case 50:
                                this.firstUrl = n13.r();
                                break;
                            case 66:
                                int z = iu7.z(n13, 66);
                                String[] strArr = this.tags;
                                int length = strArr == null ? 0 : strArr.length;
                                int i = z + length;
                                String[] strArr2 = new String[i];
                                if (length != 0) {
                                    System.arraycopy(strArr, 0, strArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    strArr2[length] = n13.r();
                                    n13.s();
                                    length++;
                                }
                                strArr2[length] = n13.r();
                                this.tags = strArr2;
                                break;
                            case 74:
                                this.previewUrl = n13.r();
                                break;
                            case 80:
                                this.updateTime = n13.q();
                                break;
                            case 104:
                                int p = n13.p();
                                if (p != 0 && p != 1 && p != 2 && p != 3 && p != 4) {
                                    break;
                                } else {
                                    this.stickerType = p;
                                    break;
                                }
                            case 120:
                                this.setId = n13.q();
                                break;
                            case 130:
                                this.lottieUrl = n13.r();
                                break;
                            case 136:
                                this.audio = n13.f();
                                break;
                            case 144:
                                int p2 = n13.p();
                                if (p2 != 0 && p2 != 1 && p2 != 2) {
                                    break;
                                } else {
                                    this.authorType = p2;
                                    break;
                                }
                            case 162:
                                this.videoUrl = n13.r();
                                break;
                            default:
                                if (n13.u(s)) {
                                    break;
                                } else {
                                    return this;
                                }
                        }
                    }
                }
            }

            public static final class Video extends gr8 {
                private static volatile Video[] _emptyArray;
                public int audioGroupIndex;
                public int audioTrackIndex;
                public ConvertOptions convertOptions;
                public int duration;
                public String externalSiteName;
                public String externalUrl;
                public int height;
                public boolean ignoreAutoplay;
                public boolean isThumbnailInCache;
                public boolean live;
                public byte[] previewData;
                public long startTime;
                public String thumbnail;
                public String token;
                public VideoCollage videoCollage;
                public long videoId;
                public int videoType;
                public int width;

                public static final class ConvertOptions extends gr8 {
                    private static volatile ConvertOptions[] _emptyArray;
                    public float endTrimPosition;
                    public boolean mute;
                    public Quality quality;
                    public int qualityValue;
                    public float startTrimPosition;

                    public ConvertOptions() {
                        clear();
                    }

                    public static ConvertOptions[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (tz6.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new ConvertOptions[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static ConvertOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return gr8.mergeFrom(new ConvertOptions(), bArr);
                    }

                    public ConvertOptions clear() {
                        this.quality = null;
                        this.startTrimPosition = 0.0f;
                        this.endTrimPosition = 0.0f;
                        this.qualityValue = 0;
                        this.mute = false;
                        this.cachedSize = -1;
                        return this;
                    }

                    public int computeSerializedSize() {
                        Quality quality2 = this.quality;
                        int i = quality2 != null ? o13.i(1, quality2) : 0;
                        if (Float.floatToIntBits(this.startTrimPosition) != Float.floatToIntBits(0.0f)) {
                            i += o13.e(2);
                        }
                        if (Float.floatToIntBits(this.endTrimPosition) != Float.floatToIntBits(0.0f)) {
                            i += o13.e(3);
                        }
                        int i2 = this.qualityValue;
                        if (i2 != 0) {
                            i += o13.f(4, i2);
                        }
                        return this.mute ? i + o13.a(5) : i;
                    }

                    public void writeTo(o13 o13) throws IOException {
                        Quality quality2 = this.quality;
                        if (quality2 != null) {
                            o13.y(1, quality2);
                        }
                        if (Float.floatToIntBits(this.startTrimPosition) != Float.floatToIntBits(0.0f)) {
                            o13.v(2, this.startTrimPosition);
                        }
                        if (Float.floatToIntBits(this.endTrimPosition) != Float.floatToIntBits(0.0f)) {
                            o13.v(3, this.endTrimPosition);
                        }
                        int i = this.qualityValue;
                        if (i != 0) {
                            o13.w(4, i);
                        }
                        boolean z = this.mute;
                        if (z) {
                            o13.r(5, z);
                        }
                    }

                    public static ConvertOptions parseFrom(n13 n13) throws IOException {
                        return new ConvertOptions().mergeFrom(n13);
                    }

                    public ConvertOptions mergeFrom(n13 n13) throws IOException {
                        while (true) {
                            int s = n13.s();
                            if (s == 0) {
                                return this;
                            }
                            if (s == 10) {
                                if (this.quality == null) {
                                    this.quality = new Quality();
                                }
                                n13.j(this.quality);
                            } else if (s == 21) {
                                this.startTrimPosition = n13.i();
                            } else if (s == 29) {
                                this.endTrimPosition = n13.i();
                            } else if (s == 32) {
                                this.qualityValue = n13.p();
                            } else if (s == 40) {
                                this.mute = n13.f();
                            } else if (!n13.u(s)) {
                                return this;
                            }
                        }
                    }
                }

                public static final class Quality extends gr8 {
                    private static volatile Quality[] _emptyArray;
                    public int bitrate;
                    public int height;
                    public boolean isOriginal;
                    public int ordinal;
                    public int width;

                    public Quality() {
                        clear();
                    }

                    public static Quality[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (tz6.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new Quality[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static Quality parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return gr8.mergeFrom(new Quality(), bArr);
                    }

                    public Quality clear() {
                        this.ordinal = 0;
                        this.width = 0;
                        this.height = 0;
                        this.isOriginal = false;
                        this.bitrate = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    public int computeSerializedSize() {
                        int i = this.ordinal;
                        int f = i != 0 ? o13.f(1, i) : 0;
                        int i2 = this.width;
                        if (i2 != 0) {
                            f += o13.f(2, i2);
                        }
                        int i3 = this.height;
                        if (i3 != 0) {
                            f += o13.f(3, i3);
                        }
                        if (this.isOriginal) {
                            f += o13.a(4);
                        }
                        int i4 = this.bitrate;
                        return i4 != 0 ? f + o13.f(5, i4) : f;
                    }

                    public void writeTo(o13 o13) throws IOException {
                        int i = this.ordinal;
                        if (i != 0) {
                            o13.w(1, i);
                        }
                        int i2 = this.width;
                        if (i2 != 0) {
                            o13.w(2, i2);
                        }
                        int i3 = this.height;
                        if (i3 != 0) {
                            o13.w(3, i3);
                        }
                        boolean z = this.isOriginal;
                        if (z) {
                            o13.r(4, z);
                        }
                        int i4 = this.bitrate;
                        if (i4 != 0) {
                            o13.w(5, i4);
                        }
                    }

                    public static Quality parseFrom(n13 n13) throws IOException {
                        return new Quality().mergeFrom(n13);
                    }

                    public Quality mergeFrom(n13 n13) throws IOException {
                        while (true) {
                            int s = n13.s();
                            if (s == 0) {
                                return this;
                            }
                            if (s == 8) {
                                this.ordinal = n13.p();
                            } else if (s == 16) {
                                this.width = n13.p();
                            } else if (s == 24) {
                                this.height = n13.p();
                            } else if (s == 32) {
                                this.isOriginal = n13.f();
                            } else if (s == 40) {
                                this.bitrate = n13.p();
                            } else if (!n13.u(s)) {
                                return this;
                            }
                        }
                    }
                }

                public static final class VideoCollage extends gr8 {
                    private static volatile VideoCollage[] _emptyArray;
                    public int count;
                    public int frequency;
                    public int height;
                    public String url;
                    public int width;

                    public VideoCollage() {
                        clear();
                    }

                    public static VideoCollage[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (tz6.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new VideoCollage[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static VideoCollage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return gr8.mergeFrom(new VideoCollage(), bArr);
                    }

                    public VideoCollage clear() {
                        this.url = "";
                        this.frequency = 0;
                        this.height = 0;
                        this.width = 0;
                        this.count = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    public int computeSerializedSize() {
                        int l = !this.url.equals("") ? o13.l(1, this.url) : 0;
                        int i = this.frequency;
                        if (i != 0) {
                            l += o13.f(2, i);
                        }
                        int i2 = this.height;
                        if (i2 != 0) {
                            l += o13.f(3, i2);
                        }
                        int i3 = this.width;
                        if (i3 != 0) {
                            l += o13.f(4, i3);
                        }
                        int i4 = this.count;
                        return i4 != 0 ? l + o13.f(5, i4) : l;
                    }

                    public void writeTo(o13 o13) throws IOException {
                        if (!this.url.equals("")) {
                            o13.E(1, this.url);
                        }
                        int i = this.frequency;
                        if (i != 0) {
                            o13.w(2, i);
                        }
                        int i2 = this.height;
                        if (i2 != 0) {
                            o13.w(3, i2);
                        }
                        int i3 = this.width;
                        if (i3 != 0) {
                            o13.w(4, i3);
                        }
                        int i4 = this.count;
                        if (i4 != 0) {
                            o13.w(5, i4);
                        }
                    }

                    public static VideoCollage parseFrom(n13 n13) throws IOException {
                        return new VideoCollage().mergeFrom(n13);
                    }

                    public VideoCollage mergeFrom(n13 n13) throws IOException {
                        while (true) {
                            int s = n13.s();
                            if (s == 0) {
                                return this;
                            }
                            if (s == 10) {
                                this.url = n13.r();
                            } else if (s == 16) {
                                this.frequency = n13.p();
                            } else if (s == 24) {
                                this.height = n13.p();
                            } else if (s == 32) {
                                this.width = n13.p();
                            } else if (s == 40) {
                                this.count = n13.p();
                            } else if (!n13.u(s)) {
                                return this;
                            }
                        }
                    }
                }

                public Video() {
                    clear();
                }

                public static Video[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Video[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Video parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new Video(), bArr);
                }

                public Video clear() {
                    this.videoId = 0;
                    this.duration = 0;
                    this.thumbnail = "";
                    this.width = 0;
                    this.height = 0;
                    this.live = false;
                    this.externalUrl = "";
                    this.previewData = iu7.o;
                    this.isThumbnailInCache = false;
                    this.startTime = 0;
                    this.externalSiteName = "";
                    this.convertOptions = null;
                    this.token = "";
                    this.videoCollage = null;
                    this.ignoreAutoplay = false;
                    this.audioTrackIndex = 0;
                    this.audioGroupIndex = 0;
                    this.videoType = 0;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.videoId;
                    int h = j != 0 ? o13.h(1, j) : 0;
                    int i = this.duration;
                    if (i != 0) {
                        h += o13.f(2, i);
                    }
                    if (!this.thumbnail.equals("")) {
                        h += o13.l(3, this.thumbnail);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        h += o13.f(4, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        h += o13.f(5, i3);
                    }
                    if (this.live) {
                        h += o13.a(6);
                    }
                    if (!this.externalUrl.equals("")) {
                        h += o13.l(7, this.externalUrl);
                    }
                    if (!Arrays.equals(this.previewData, iu7.o)) {
                        h += o13.b(8, this.previewData);
                    }
                    if (this.isThumbnailInCache) {
                        h += o13.a(9);
                    }
                    long j2 = this.startTime;
                    if (j2 != 0) {
                        h += o13.h(10, j2);
                    }
                    if (!this.externalSiteName.equals("")) {
                        h += o13.l(11, this.externalSiteName);
                    }
                    ConvertOptions convertOptions2 = this.convertOptions;
                    if (convertOptions2 != null) {
                        h += o13.i(12, convertOptions2);
                    }
                    if (!this.token.equals("")) {
                        h += o13.l(13, this.token);
                    }
                    VideoCollage videoCollage2 = this.videoCollage;
                    if (videoCollage2 != null) {
                        h += o13.i(14, videoCollage2);
                    }
                    if (this.ignoreAutoplay) {
                        h += o13.a(15);
                    }
                    int i4 = this.audioTrackIndex;
                    if (i4 != 0) {
                        h += o13.f(16, i4);
                    }
                    int i5 = this.audioGroupIndex;
                    if (i5 != 0) {
                        h += o13.f(17, i5);
                    }
                    int i6 = this.videoType;
                    return i6 != 0 ? h + o13.f(18, i6) : h;
                }

                public void writeTo(o13 o13) throws IOException {
                    long j = this.videoId;
                    if (j != 0) {
                        o13.x(1, j);
                    }
                    int i = this.duration;
                    if (i != 0) {
                        o13.w(2, i);
                    }
                    if (!this.thumbnail.equals("")) {
                        o13.E(3, this.thumbnail);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        o13.w(4, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        o13.w(5, i3);
                    }
                    boolean z = this.live;
                    if (z) {
                        o13.r(6, z);
                    }
                    if (!this.externalUrl.equals("")) {
                        o13.E(7, this.externalUrl);
                    }
                    if (!Arrays.equals(this.previewData, iu7.o)) {
                        o13.s(8, this.previewData);
                    }
                    boolean z2 = this.isThumbnailInCache;
                    if (z2) {
                        o13.r(9, z2);
                    }
                    long j2 = this.startTime;
                    if (j2 != 0) {
                        o13.x(10, j2);
                    }
                    if (!this.externalSiteName.equals("")) {
                        o13.E(11, this.externalSiteName);
                    }
                    ConvertOptions convertOptions2 = this.convertOptions;
                    if (convertOptions2 != null) {
                        o13.y(12, convertOptions2);
                    }
                    if (!this.token.equals("")) {
                        o13.E(13, this.token);
                    }
                    VideoCollage videoCollage2 = this.videoCollage;
                    if (videoCollage2 != null) {
                        o13.y(14, videoCollage2);
                    }
                    boolean z3 = this.ignoreAutoplay;
                    if (z3) {
                        o13.r(15, z3);
                    }
                    int i4 = this.audioTrackIndex;
                    if (i4 != 0) {
                        o13.w(16, i4);
                    }
                    int i5 = this.audioGroupIndex;
                    if (i5 != 0) {
                        o13.w(17, i5);
                    }
                    int i6 = this.videoType;
                    if (i6 != 0) {
                        o13.w(18, i6);
                    }
                }

                public static Video parseFrom(n13 n13) throws IOException {
                    return new Video().mergeFrom(n13);
                }

                public Video mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        switch (s) {
                            case 0:
                                return this;
                            case 8:
                                this.videoId = n13.q();
                                break;
                            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                                this.duration = n13.p();
                                break;
                            case 26:
                                this.thumbnail = n13.r();
                                break;
                            case 32:
                                this.width = n13.p();
                                break;
                            case 40:
                                this.height = n13.p();
                                break;
                            case 48:
                                this.live = n13.f();
                                break;
                            case 58:
                                this.externalUrl = n13.r();
                                break;
                            case 66:
                                this.previewData = n13.g();
                                break;
                            case 72:
                                this.isThumbnailInCache = n13.f();
                                break;
                            case 80:
                                this.startTime = n13.q();
                                break;
                            case 90:
                                this.externalSiteName = n13.r();
                                break;
                            case 98:
                                if (this.convertOptions == null) {
                                    this.convertOptions = new ConvertOptions();
                                }
                                n13.j(this.convertOptions);
                                break;
                            case 106:
                                this.token = n13.r();
                                break;
                            case 114:
                                if (this.videoCollage == null) {
                                    this.videoCollage = new VideoCollage();
                                }
                                n13.j(this.videoCollage);
                                break;
                            case 120:
                                this.ignoreAutoplay = n13.f();
                                break;
                            case 128:
                                this.audioTrackIndex = n13.p();
                                break;
                            case 136:
                                this.audioGroupIndex = n13.p();
                                break;
                            case 144:
                                this.videoType = n13.p();
                                break;
                            default:
                                if (n13.u(s)) {
                                    break;
                                } else {
                                    return this;
                                }
                        }
                    }
                }
            }

            public Attach() {
                clear();
            }

            public static Attach[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Attach[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static Attach parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new Attach(), bArr);
            }

            public Attach clear() {
                this.type = 0;
                this.photo = null;
                this.control = null;
                this.video = null;
                this.audio = null;
                this.sticker = null;
                this.share = null;
                this.app = null;
                this.call = null;
                this.status = 0;
                this.lastErrorTime = 0;
                this.progress = 0;
                this.localId = "";
                this.localPath = "";
                this.isProcessingOnServer = false;
                this.isDeleted = false;
                this.totalBytes = 0;
                this.bytesDownloaded = 0;
                this.file = null;
                this.contact = null;
                this.lastModified = 0;
                this.present = null;
                this.inlineKeyboard = null;
                this.location = null;
                this.progressFloat = 0.0f;
                this.processingOnServerStatus = 0;
                this.sensitiveContentUnlocked = false;
                this.sensitive = false;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int i = this.type;
                int f = i != 0 ? o13.f(1, i) : 0;
                Photo photo2 = this.photo;
                if (photo2 != null) {
                    f += o13.i(2, photo2);
                }
                Control control2 = this.control;
                if (control2 != null) {
                    f += o13.i(3, control2);
                }
                Video video2 = this.video;
                if (video2 != null) {
                    f += o13.i(4, video2);
                }
                Audio audio2 = this.audio;
                if (audio2 != null) {
                    f += o13.i(5, audio2);
                }
                Sticker sticker2 = this.sticker;
                if (sticker2 != null) {
                    f += o13.i(6, sticker2);
                }
                Share share2 = this.share;
                if (share2 != null) {
                    f += o13.i(7, share2);
                }
                App app2 = this.app;
                if (app2 != null) {
                    f += o13.i(8, app2);
                }
                Call call2 = this.call;
                if (call2 != null) {
                    f += o13.i(9, call2);
                }
                int i2 = this.status;
                if (i2 != 0) {
                    f += o13.f(10, i2);
                }
                long j = this.lastErrorTime;
                if (j != 0) {
                    f += o13.h(11, j);
                }
                int i3 = this.progress;
                if (i3 != 0) {
                    f += o13.f(12, i3);
                }
                if (!this.localId.equals("")) {
                    f += o13.l(13, this.localId);
                }
                if (!this.localPath.equals("")) {
                    f += o13.l(14, this.localPath);
                }
                if (this.isProcessingOnServer) {
                    f += o13.a(15);
                }
                if (this.isDeleted) {
                    f += o13.a(16);
                }
                long j2 = this.totalBytes;
                if (j2 != 0) {
                    f += o13.h(17, j2);
                }
                long j3 = this.bytesDownloaded;
                if (j3 != 0) {
                    f += o13.h(18, j3);
                }
                File file2 = this.file;
                if (file2 != null) {
                    f += o13.i(20, file2);
                }
                Contact contact2 = this.contact;
                if (contact2 != null) {
                    f += o13.i(21, contact2);
                }
                long j4 = this.lastModified;
                if (j4 != 0) {
                    f += o13.h(22, j4);
                }
                Present present2 = this.present;
                if (present2 != null) {
                    f += o13.i(23, present2);
                }
                InlineKeyboard inlineKeyboard2 = this.inlineKeyboard;
                if (inlineKeyboard2 != null) {
                    f += o13.i(24, inlineKeyboard2);
                }
                Location location2 = this.location;
                if (location2 != null) {
                    f += o13.i(25, location2);
                }
                if (Float.floatToIntBits(this.progressFloat) != Float.floatToIntBits(0.0f)) {
                    f += o13.e(26);
                }
                int i4 = this.processingOnServerStatus;
                if (i4 != 0) {
                    f += o13.f(27, i4);
                }
                if (this.sensitiveContentUnlocked) {
                    f += o13.a(28);
                }
                return this.sensitive ? f + o13.a(29) : f;
            }

            public void writeTo(o13 o13) throws IOException {
                int i = this.type;
                if (i != 0) {
                    o13.w(1, i);
                }
                Photo photo2 = this.photo;
                if (photo2 != null) {
                    o13.y(2, photo2);
                }
                Control control2 = this.control;
                if (control2 != null) {
                    o13.y(3, control2);
                }
                Video video2 = this.video;
                if (video2 != null) {
                    o13.y(4, video2);
                }
                Audio audio2 = this.audio;
                if (audio2 != null) {
                    o13.y(5, audio2);
                }
                Sticker sticker2 = this.sticker;
                if (sticker2 != null) {
                    o13.y(6, sticker2);
                }
                Share share2 = this.share;
                if (share2 != null) {
                    o13.y(7, share2);
                }
                App app2 = this.app;
                if (app2 != null) {
                    o13.y(8, app2);
                }
                Call call2 = this.call;
                if (call2 != null) {
                    o13.y(9, call2);
                }
                int i2 = this.status;
                if (i2 != 0) {
                    o13.w(10, i2);
                }
                long j = this.lastErrorTime;
                if (j != 0) {
                    o13.x(11, j);
                }
                int i3 = this.progress;
                if (i3 != 0) {
                    o13.w(12, i3);
                }
                if (!this.localId.equals("")) {
                    o13.E(13, this.localId);
                }
                if (!this.localPath.equals("")) {
                    o13.E(14, this.localPath);
                }
                boolean z = this.isProcessingOnServer;
                if (z) {
                    o13.r(15, z);
                }
                boolean z2 = this.isDeleted;
                if (z2) {
                    o13.r(16, z2);
                }
                long j2 = this.totalBytes;
                if (j2 != 0) {
                    o13.x(17, j2);
                }
                long j3 = this.bytesDownloaded;
                if (j3 != 0) {
                    o13.x(18, j3);
                }
                File file2 = this.file;
                if (file2 != null) {
                    o13.y(20, file2);
                }
                Contact contact2 = this.contact;
                if (contact2 != null) {
                    o13.y(21, contact2);
                }
                long j4 = this.lastModified;
                if (j4 != 0) {
                    o13.x(22, j4);
                }
                Present present2 = this.present;
                if (present2 != null) {
                    o13.y(23, present2);
                }
                InlineKeyboard inlineKeyboard2 = this.inlineKeyboard;
                if (inlineKeyboard2 != null) {
                    o13.y(24, inlineKeyboard2);
                }
                Location location2 = this.location;
                if (location2 != null) {
                    o13.y(25, location2);
                }
                if (Float.floatToIntBits(this.progressFloat) != Float.floatToIntBits(0.0f)) {
                    o13.v(26, this.progressFloat);
                }
                int i4 = this.processingOnServerStatus;
                if (i4 != 0) {
                    o13.w(27, i4);
                }
                boolean z3 = this.sensitiveContentUnlocked;
                if (z3) {
                    o13.r(28, z3);
                }
                boolean z4 = this.sensitive;
                if (z4) {
                    o13.r(29, z4);
                }
            }

            public static Attach parseFrom(n13 n13) throws IOException {
                return new Attach().mergeFrom(n13);
            }

            public Attach mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    switch (s) {
                        case 0:
                            return this;
                        case 8:
                            int p = n13.p();
                            switch (p) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case PRESENT /*12*/:
                                case 13:
                                case LOCATION /*14*/:
                                case DAILY_MEDIA /*15*/:
                                    this.type = p;
                                    break;
                            }
                        case 18:
                            if (this.photo == null) {
                                this.photo = new Photo();
                            }
                            n13.j(this.photo);
                            break;
                        case 26:
                            if (this.control == null) {
                                this.control = new Control();
                            }
                            n13.j(this.control);
                            break;
                        case 34:
                            if (this.video == null) {
                                this.video = new Video();
                            }
                            n13.j(this.video);
                            break;
                        case 42:
                            if (this.audio == null) {
                                this.audio = new Audio();
                            }
                            n13.j(this.audio);
                            break;
                        case 50:
                            if (this.sticker == null) {
                                this.sticker = new Sticker();
                            }
                            n13.j(this.sticker);
                            break;
                        case 58:
                            if (this.share == null) {
                                this.share = new Share();
                            }
                            n13.j(this.share);
                            break;
                        case 66:
                            if (this.app == null) {
                                this.app = new App();
                            }
                            n13.j(this.app);
                            break;
                        case 74:
                            if (this.call == null) {
                                this.call = new Call();
                            }
                            n13.j(this.call);
                            break;
                        case 80:
                            int p2 = n13.p();
                            if (p2 != 0 && p2 != 1 && p2 != 2 && p2 != 3 && p2 != 4) {
                                break;
                            } else {
                                this.status = p2;
                                break;
                            }
                        case 88:
                            this.lastErrorTime = n13.q();
                            break;
                        case 96:
                            this.progress = n13.p();
                            break;
                        case 106:
                            this.localId = n13.r();
                            break;
                        case 114:
                            this.localPath = n13.r();
                            break;
                        case 120:
                            this.isProcessingOnServer = n13.f();
                            break;
                        case 128:
                            this.isDeleted = n13.f();
                            break;
                        case 136:
                            this.totalBytes = n13.q();
                            break;
                        case 144:
                            this.bytesDownloaded = n13.q();
                            break;
                        case 162:
                            if (this.file == null) {
                                this.file = new File();
                            }
                            n13.j(this.file);
                            break;
                        case 170:
                            if (this.contact == null) {
                                this.contact = new Contact();
                            }
                            n13.j(this.contact);
                            break;
                        case 176:
                            this.lastModified = n13.q();
                            break;
                        case 186:
                            if (this.present == null) {
                                this.present = new Present();
                            }
                            n13.j(this.present);
                            break;
                        case 194:
                            if (this.inlineKeyboard == null) {
                                this.inlineKeyboard = new InlineKeyboard();
                            }
                            n13.j(this.inlineKeyboard);
                            break;
                        case HttpStatus.SC_ACCEPTED:
                            if (this.location == null) {
                                this.location = new Location();
                            }
                            n13.j(this.location);
                            break;
                        case 213:
                            this.progressFloat = n13.i();
                            break;
                        case 216:
                            int p3 = n13.p();
                            if (p3 != 0 && p3 != 1 && p3 != 2) {
                                break;
                            } else {
                                this.processingOnServerStatus = p3;
                                break;
                            }
                        case 224:
                            this.sensitiveContentUnlocked = n13.f();
                            break;
                        case 232:
                            this.sensitive = n13.f();
                            break;
                        default:
                            if (n13.u(s)) {
                                break;
                            } else {
                                return this;
                            }
                    }
                }
            }
        }

        public static final class LocationInfo extends gr8 {
            private static volatile LocationInfo[] _emptyArray;
            public float accuracy;
            public double altitude;
            public float bearing;
            public double latitude;
            public double longitude;
            public float speed;
            public long time;

            public LocationInfo() {
                clear();
            }

            public static LocationInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LocationInfo[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static LocationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new LocationInfo(), bArr);
            }

            public LocationInfo clear() {
                this.latitude = 0.0d;
                this.longitude = 0.0d;
                this.time = 0;
                this.altitude = 0.0d;
                this.accuracy = 0.0f;
                this.bearing = 0.0f;
                this.speed = 0.0f;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int c = Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d) ? o13.c(1) : 0;
                if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                    c += o13.c(2);
                }
                long j = this.time;
                if (j != 0) {
                    c += o13.h(3, j);
                }
                if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                    c += o13.c(4);
                }
                if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                    c += o13.e(5);
                }
                if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                    c += o13.e(6);
                }
                return Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f) ? c + o13.e(7) : c;
            }

            public void writeTo(o13 o13) throws IOException {
                if (Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d)) {
                    o13.t(1, this.latitude);
                }
                if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                    o13.t(2, this.longitude);
                }
                long j = this.time;
                if (j != 0) {
                    o13.x(3, j);
                }
                if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                    o13.t(4, this.altitude);
                }
                if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                    o13.v(5, this.accuracy);
                }
                if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                    o13.v(6, this.bearing);
                }
                if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f)) {
                    o13.v(7, this.speed);
                }
            }

            public static LocationInfo parseFrom(n13 n13) throws IOException {
                return new LocationInfo().mergeFrom(n13);
            }

            public LocationInfo mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 9) {
                        this.latitude = n13.h();
                    } else if (s == 17) {
                        this.longitude = n13.h();
                    } else if (s == 24) {
                        this.time = n13.q();
                    } else if (s == 33) {
                        this.altitude = n13.h();
                    } else if (s == 45) {
                        this.accuracy = n13.i();
                    } else if (s == 53) {
                        this.bearing = n13.i();
                    } else if (s == 61) {
                        this.speed = n13.i();
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public Attaches() {
            clear();
        }

        public static Attaches[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Attaches[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Attaches parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new Attaches(), bArr);
        }

        public Attaches clear() {
            this.attach = Attach.emptyArray();
            this.keyboard = null;
            this.sendAction = null;
            this.replyKeyboard = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            Attach[] attachArr = this.attach;
            int i = 0;
            if (attachArr != null && attachArr.length > 0) {
                int i2 = 0;
                while (true) {
                    gr8[] gr8Arr = this.attach;
                    if (i >= gr8Arr.length) {
                        break;
                    }
                    gr8 gr8 = gr8Arr[i];
                    if (gr8 != null) {
                        i2 = o13.i(1, gr8) + i2;
                    }
                    i++;
                }
                i = i2;
            }
            Attach.InlineKeyboard inlineKeyboard = this.keyboard;
            if (inlineKeyboard != null) {
                i += o13.i(2, inlineKeyboard);
            }
            Attach.SendAction sendAction2 = this.sendAction;
            if (sendAction2 != null) {
                i += o13.i(3, sendAction2);
            }
            Attach.ReplyKeyboard replyKeyboard2 = this.replyKeyboard;
            return replyKeyboard2 != null ? i + o13.i(4, replyKeyboard2) : i;
        }

        public void writeTo(o13 o13) throws IOException {
            Attach[] attachArr = this.attach;
            if (attachArr != null && attachArr.length > 0) {
                int i = 0;
                while (true) {
                    gr8[] gr8Arr = this.attach;
                    if (i >= gr8Arr.length) {
                        break;
                    }
                    gr8 gr8 = gr8Arr[i];
                    if (gr8 != null) {
                        o13.y(1, gr8);
                    }
                    i++;
                }
            }
            Attach.InlineKeyboard inlineKeyboard = this.keyboard;
            if (inlineKeyboard != null) {
                o13.y(2, inlineKeyboard);
            }
            Attach.SendAction sendAction2 = this.sendAction;
            if (sendAction2 != null) {
                o13.y(3, sendAction2);
            }
            Attach.ReplyKeyboard replyKeyboard2 = this.replyKeyboard;
            if (replyKeyboard2 != null) {
                o13.y(4, replyKeyboard2);
            }
        }

        public static Attaches parseFrom(n13 n13) throws IOException {
            return new Attaches().mergeFrom(n13);
        }

        public Attaches mergeFrom(n13 n13) throws IOException {
            while (true) {
                int s = n13.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    int z = iu7.z(n13, 10);
                    Attach[] attachArr = this.attach;
                    int length = attachArr == null ? 0 : attachArr.length;
                    int i = z + length;
                    Attach[] attachArr2 = new Attach[i];
                    if (length != 0) {
                        System.arraycopy(attachArr, 0, attachArr2, 0, length);
                    }
                    while (length < i - 1) {
                        Attach attach2 = new Attach();
                        attachArr2[length] = attach2;
                        n13.j(attach2);
                        n13.s();
                        length++;
                    }
                    Attach attach3 = new Attach();
                    attachArr2[length] = attach3;
                    n13.j(attach3);
                    this.attach = attachArr2;
                } else if (s == 18) {
                    if (this.keyboard == null) {
                        this.keyboard = new Attach.InlineKeyboard();
                    }
                    n13.j(this.keyboard);
                } else if (s == 26) {
                    if (this.sendAction == null) {
                        this.sendAction = new Attach.SendAction();
                    }
                    n13.j(this.sendAction);
                } else if (s == 34) {
                    if (this.replyKeyboard == null) {
                        this.replyKeyboard = new Attach.ReplyKeyboard();
                    }
                    n13.j(this.replyKeyboard);
                } else if (!n13.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class CallHistoryState extends gr8 {
        private static volatile CallHistoryState[] _emptyArray;
        public long backwardMarker;
        public Chat.Chunk chunk;
        public long forwardMarker;
        public boolean hasNext;
        public boolean hasPrev;
        public Map<Long, MissedMessagesItem> missedMessagesIds;

        public static final class MissedMessagesItem extends gr8 {
            private static volatile MissedMessagesItem[] _emptyArray;
            public long[] ids;

            public MissedMessagesItem() {
                clear();
            }

            public static MissedMessagesItem[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new MissedMessagesItem[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static MissedMessagesItem parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new MissedMessagesItem(), bArr);
            }

            public MissedMessagesItem clear() {
                this.ids = iu7.l;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long[] jArr = this.ids;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i >= jArr2.length) {
                        return i2 + jArr2.length;
                    }
                    i2 += o13.k(jArr2[i]);
                    i++;
                }
            }

            public void writeTo(o13 o13) throws IOException {
                long[] jArr = this.ids;
                if (jArr != null && jArr.length > 0) {
                    int i = 0;
                    while (true) {
                        long[] jArr2 = this.ids;
                        if (i < jArr2.length) {
                            o13.x(1, jArr2[i]);
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            }

            public static MissedMessagesItem parseFrom(n13 n13) throws IOException {
                return new MissedMessagesItem().mergeFrom(n13);
            }

            public MissedMessagesItem mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        int z = iu7.z(n13, 8);
                        long[] jArr = this.ids;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = z + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = n13.q();
                            n13.s();
                            length++;
                        }
                        jArr2[length] = n13.q();
                        this.ids = jArr2;
                    } else if (s == 10) {
                        int e = n13.e(n13.p());
                        int c = n13.c();
                        int i2 = 0;
                        while (n13.b() > 0) {
                            n13.q();
                            i2++;
                        }
                        n13.t(c);
                        long[] jArr3 = this.ids;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = n13.q();
                            length2++;
                        }
                        this.ids = jArr4;
                        n13.d(e);
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public CallHistoryState() {
            clear();
        }

        public static CallHistoryState[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CallHistoryState[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static CallHistoryState parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new CallHistoryState(), bArr);
        }

        public CallHistoryState clear() {
            this.chunk = null;
            this.forwardMarker = 0;
            this.backwardMarker = 0;
            this.hasNext = false;
            this.hasPrev = false;
            this.missedMessagesIds = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            Chat.Chunk chunk2 = this.chunk;
            int i = chunk2 != null ? o13.i(1, chunk2) : 0;
            long j = this.forwardMarker;
            if (j != 0) {
                i += o13.h(2, j);
            }
            long j2 = this.backwardMarker;
            if (j2 != 0) {
                i += o13.h(3, j2);
            }
            if (this.hasNext) {
                i += o13.a(4);
            }
            if (this.hasPrev) {
                i += o13.a(5);
            }
            Map<Long, MissedMessagesItem> map = this.missedMessagesIds;
            return map != null ? i + tz6.a(map, 6, 3, 11) : i;
        }

        public CallHistoryState mergeFrom(n13 n13) throws IOException {
            mt7 mt7 = xy6.d;
            while (true) {
                int s = n13.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    if (this.chunk == null) {
                        this.chunk = new Chat.Chunk();
                    }
                    n13.j(this.chunk);
                } else if (s == 16) {
                    this.forwardMarker = n13.q();
                } else if (s == 24) {
                    this.backwardMarker = n13.q();
                } else if (s == 32) {
                    this.hasNext = n13.f();
                } else if (s == 40) {
                    this.hasPrev = n13.f();
                } else if (s == 50) {
                    this.missedMessagesIds = tz6.b(n13, this.missedMessagesIds, mt7, 3, 11, new MissedMessagesItem(), 8, 18);
                } else if (!n13.u(s)) {
                    return this;
                }
            }
        }

        public void writeTo(o13 o13) throws IOException {
            Chat.Chunk chunk2 = this.chunk;
            if (chunk2 != null) {
                o13.y(1, chunk2);
            }
            long j = this.forwardMarker;
            if (j != 0) {
                o13.x(2, j);
            }
            long j2 = this.backwardMarker;
            if (j2 != 0) {
                o13.x(3, j2);
            }
            boolean z = this.hasNext;
            if (z) {
                o13.r(4, z);
            }
            boolean z2 = this.hasPrev;
            if (z2) {
                o13.r(5, z2);
            }
            Map<Long, MissedMessagesItem> map = this.missedMessagesIds;
            if (map != null) {
                tz6.d(o13, map, 6, 3, 11);
            }
        }

        public static CallHistoryState parseFrom(n13 n13) throws IOException {
            return new CallHistoryState().mergeFrom(n13);
        }
    }

    public static final class Chat extends gr8 {
        public static final int ACTIVE = 0;
        public static final int CHANGE_PARTICIPANT = 2;
        public static final int CHANNEL = 2;
        public static final int CHAT = 1;
        public static final int CLOSED = 5;
        public static final int DIALOG = 0;
        public static final int GROUP_CHAT = 3;
        public static final int HIDDEN = 6;
        public static final int ICON = 1;
        public static final int LEAVING = 2;
        public static final int LED = 2;
        public static final int LEFT = 1;
        public static final int PIN_MESSAGE = 3;
        public static final int PRIVATE = 1;
        public static final int PUBLIC = 0;
        public static final int REMOVED = 3;
        public static final int REMOVING = 4;
        public static final int SOUND = 0;
        public static final int TITLE = 0;
        public static final int VIBRATION = 1;
        private static volatile Chat[] _emptyArray;
        public int accessType;
        public Map<Long, AdminParticipant> adminParticipants;
        public long[] admins;
        public String baseIconUrl;
        public String baseRawIconUrl;
        public int blockedParticipantsCount;
        public BotsInfo botsInfo;
        public ChannelInfo channelInfo;
        public long[] chatFoldersIds;
        public ChatOptions chatOptions;
        public ChatSettings chatSettings;
        public ChatSubject chatSubject;
        public Chunk[] chunk;
        public long cid;
        public long created;
        public Chunk[] delayedChunk;
        public String description;
        public byte[] draft;
        public long draftUpdateTime;
        public long draftUpdateTimeForSyncLogic;
        public long firstMessageId;
        public int flagsSettings;
        public GroupChatInfo groupChatInfo;
        public boolean hidePinnedMessage;
        public long joinTime;
        public long lastDelayedUpdateTime;
        public long lastEventTime;
        public long lastFireDelayedErrorTime;
        public String lastInput;
        public long lastInputEditMessageId;
        public LastInputMedia[] lastInputMedia;
        public long lastInputReplyMessageId;
        public long lastMentionMessageId;
        public long lastMessageId;
        public long lastOpenNewMessages;
        public int lastOpenPositionOffset;
        public long lastOpenPositionTime;
        public long lastOpenReadMark;
        public PushMessage lastPushMessage;
        public long lastReactedMessageId;
        public String lastReaction;
        public long lastSearchClickTime;
        public long lastWriteTime;
        public String link;
        public Map<Long, Long> liveLocationMessageIds;
        public int[] localChanges;
        public boolean markedAsUnread;
        public ChatMedia mediaAll;
        public ChatMedia mediaAudio;
        public ChatMedia mediaFiles;
        public ChatMedia mediaLocations;
        public ChatMedia mediaMusic;
        public ChatMedia mediaPhotoVideo;
        public ChatMedia mediaShare;
        public int messagesTtlSec;
        public long modified;
        public int newMessages;
        public long owner;
        public Map<Long, Long> participants;
        public int participantsCount;
        public long pinnedMessageId;
        public int restrictions;
        public Section[] sections;
        public long serverId;
        public int status;
        public String[] stickersOrder;
        public long stickersSyncTime;
        public boolean subscribedToUpdates;
        public String title;
        public int type;
        public long unbindOkPanelCloseTime;
        public boolean unreadPin;
        public boolean unreadReply;
        public VideoConversation videoConversation;

        public static final class AdminParticipant extends gr8 {
            private static volatile AdminParticipant[] _emptyArray;
            public String alias;
            public long id;
            public long inviterId;
            public int permissions;

            public AdminParticipant() {
                clear();
            }

            public static AdminParticipant[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new AdminParticipant[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static AdminParticipant parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new AdminParticipant(), bArr);
            }

            public AdminParticipant clear() {
                this.id = 0;
                this.permissions = 0;
                this.inviterId = 0;
                this.alias = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long j = this.id;
                int h = j != 0 ? o13.h(1, j) : 0;
                int i = this.permissions;
                if (i != 0) {
                    h += o13.f(2, i);
                }
                long j2 = this.inviterId;
                if (j2 != 0) {
                    h += o13.h(3, j2);
                }
                return !this.alias.equals("") ? h + o13.l(4, this.alias) : h;
            }

            public void writeTo(o13 o13) throws IOException {
                long j = this.id;
                if (j != 0) {
                    o13.x(1, j);
                }
                int i = this.permissions;
                if (i != 0) {
                    o13.w(2, i);
                }
                long j2 = this.inviterId;
                if (j2 != 0) {
                    o13.x(3, j2);
                }
                if (!this.alias.equals("")) {
                    o13.E(4, this.alias);
                }
            }

            public static AdminParticipant parseFrom(n13 n13) throws IOException {
                return new AdminParticipant().mergeFrom(n13);
            }

            public AdminParticipant mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.id = n13.q();
                    } else if (s == 16) {
                        this.permissions = n13.p();
                    } else if (s == 24) {
                        this.inviterId = n13.q();
                    } else if (s == 34) {
                        this.alias = n13.r();
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class BotsInfo extends gr8 {
            private static volatile BotsInfo[] _emptyArray;
            public boolean hasBots;
            public boolean suspendedBot;

            public BotsInfo() {
                clear();
            }

            public static BotsInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new BotsInfo[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static BotsInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new BotsInfo(), bArr);
            }

            public BotsInfo clear() {
                this.hasBots = false;
                this.suspendedBot = false;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int a = this.hasBots ? o13.a(1) : 0;
                return this.suspendedBot ? a + o13.a(2) : a;
            }

            public void writeTo(o13 o13) throws IOException {
                boolean z = this.hasBots;
                if (z) {
                    o13.r(1, z);
                }
                boolean z2 = this.suspendedBot;
                if (z2) {
                    o13.r(2, z2);
                }
            }

            public static BotsInfo parseFrom(n13 n13) throws IOException {
                return new BotsInfo().mergeFrom(n13);
            }

            public BotsInfo mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.hasBots = n13.f();
                    } else if (s == 16) {
                        this.suspendedBot = n13.f();
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChannelInfo extends gr8 {
            private static volatile ChannelInfo[] _emptyArray;
            public long[] admins;
            public String description;
            public int membersCount;
            public boolean signAdmin;

            public ChannelInfo() {
                clear();
            }

            public static ChannelInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChannelInfo[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChannelInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new ChannelInfo(), bArr);
            }

            public ChannelInfo clear() {
                this.membersCount = 0;
                this.description = "";
                this.admins = iu7.l;
                this.signAdmin = false;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long[] jArr;
                int i = this.membersCount;
                int i2 = 0;
                int f = i != 0 ? o13.f(1, i) : 0;
                if (!this.description.equals("")) {
                    f += o13.l(2, this.description);
                }
                long[] jArr2 = this.admins;
                if (jArr2 != null && jArr2.length > 0) {
                    int i3 = 0;
                    while (true) {
                        jArr = this.admins;
                        if (i2 >= jArr.length) {
                            break;
                        }
                        i3 += o13.k(jArr[i2]);
                        i2++;
                    }
                    f = f + i3 + jArr.length;
                }
                return this.signAdmin ? f + o13.a(4) : f;
            }

            public void writeTo(o13 o13) throws IOException {
                int i = this.membersCount;
                if (i != 0) {
                    o13.w(1, i);
                }
                if (!this.description.equals("")) {
                    o13.E(2, this.description);
                }
                long[] jArr = this.admins;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.admins;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        o13.x(3, jArr2[i2]);
                        i2++;
                    }
                }
                boolean z = this.signAdmin;
                if (z) {
                    o13.r(4, z);
                }
            }

            public static ChannelInfo parseFrom(n13 n13) throws IOException {
                return new ChannelInfo().mergeFrom(n13);
            }

            public ChannelInfo mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.membersCount = n13.p();
                    } else if (s == 18) {
                        this.description = n13.r();
                    } else if (s == 24) {
                        int z = iu7.z(n13, 24);
                        long[] jArr = this.admins;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = z + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = n13.q();
                            n13.s();
                            length++;
                        }
                        jArr2[length] = n13.q();
                        this.admins = jArr2;
                    } else if (s == 26) {
                        int e = n13.e(n13.p());
                        int c = n13.c();
                        int i2 = 0;
                        while (n13.b() > 0) {
                            n13.q();
                            i2++;
                        }
                        n13.t(c);
                        long[] jArr3 = this.admins;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = n13.q();
                            length2++;
                        }
                        this.admins = jArr4;
                        n13.d(e);
                    } else if (s == 32) {
                        this.signAdmin = n13.f();
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChatMedia extends gr8 {
            private static volatile ChatMedia[] _emptyArray;
            public Chunk chunk;
            public Chunk[] chunks;
            public long firstMessageId;
            public long lastMessageId;
            public int totalCount;

            public ChatMedia() {
                clear();
            }

            public static ChatMedia[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatMedia[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatMedia parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new ChatMedia(), bArr);
            }

            public ChatMedia clear() {
                this.chunk = null;
                this.totalCount = 0;
                this.firstMessageId = 0;
                this.lastMessageId = 0;
                this.chunks = Chunk.emptyArray();
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                Chunk chunk2 = this.chunk;
                int i = 0;
                int i2 = chunk2 != null ? o13.i(1, chunk2) : 0;
                int i3 = this.totalCount;
                if (i3 != 0) {
                    i2 += o13.f(2, i3);
                }
                long j = this.firstMessageId;
                if (j != 0) {
                    i2 += o13.h(3, j);
                }
                long j2 = this.lastMessageId;
                if (j2 != 0) {
                    i2 += o13.h(4, j2);
                }
                Chunk[] chunkArr = this.chunks;
                if (chunkArr != null && chunkArr.length > 0) {
                    while (true) {
                        gr8[] gr8Arr = this.chunks;
                        if (i >= gr8Arr.length) {
                            break;
                        }
                        gr8 gr8 = gr8Arr[i];
                        if (gr8 != null) {
                            i2 = o13.i(5, gr8) + i2;
                        }
                        i++;
                    }
                }
                return i2;
            }

            public void writeTo(o13 o13) throws IOException {
                Chunk chunk2 = this.chunk;
                if (chunk2 != null) {
                    o13.y(1, chunk2);
                }
                int i = this.totalCount;
                if (i != 0) {
                    o13.w(2, i);
                }
                long j = this.firstMessageId;
                if (j != 0) {
                    o13.x(3, j);
                }
                long j2 = this.lastMessageId;
                if (j2 != 0) {
                    o13.x(4, j2);
                }
                Chunk[] chunkArr = this.chunks;
                if (chunkArr != null && chunkArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        gr8[] gr8Arr = this.chunks;
                        if (i2 < gr8Arr.length) {
                            gr8 gr8 = gr8Arr[i2];
                            if (gr8 != null) {
                                o13.y(5, gr8);
                            }
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
            }

            public static ChatMedia parseFrom(n13 n13) throws IOException {
                return new ChatMedia().mergeFrom(n13);
            }

            public ChatMedia mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 10) {
                        if (this.chunk == null) {
                            this.chunk = new Chunk();
                        }
                        n13.j(this.chunk);
                    } else if (s == 16) {
                        this.totalCount = n13.p();
                    } else if (s == 24) {
                        this.firstMessageId = n13.q();
                    } else if (s == 32) {
                        this.lastMessageId = n13.q();
                    } else if (s == 42) {
                        int z = iu7.z(n13, 42);
                        Chunk[] chunkArr = this.chunks;
                        int length = chunkArr == null ? 0 : chunkArr.length;
                        int i = z + length;
                        Chunk[] chunkArr2 = new Chunk[i];
                        if (length != 0) {
                            System.arraycopy(chunkArr, 0, chunkArr2, 0, length);
                        }
                        while (length < i - 1) {
                            Chunk chunk2 = new Chunk();
                            chunkArr2[length] = chunk2;
                            n13.j(chunk2);
                            n13.s();
                            length++;
                        }
                        Chunk chunk3 = new Chunk();
                        chunkArr2[length] = chunk3;
                        n13.j(chunk3);
                        this.chunks = chunkArr2;
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChatOptions extends gr8 {
            private static volatile ChatOptions[] _emptyArray;
            public boolean allCanPinMessage;
            public boolean membersCanSeePrivateLink;
            public boolean official;
            public boolean onlyAdminCanAddMember;
            public boolean onlyAdminCanCall;
            public boolean onlyOwnerCanChangeIconTitle;
            public boolean sentByPhone;
            public boolean serviceChat;
            public boolean signAdmin;

            public ChatOptions() {
                clear();
            }

            public static ChatOptions[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatOptions[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new ChatOptions(), bArr);
            }

            public ChatOptions clear() {
                this.signAdmin = false;
                this.onlyOwnerCanChangeIconTitle = false;
                this.official = false;
                this.allCanPinMessage = false;
                this.onlyAdminCanAddMember = false;
                this.onlyAdminCanCall = false;
                this.sentByPhone = false;
                this.serviceChat = false;
                this.membersCanSeePrivateLink = false;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int a = this.signAdmin ? o13.a(1) : 0;
                if (this.onlyOwnerCanChangeIconTitle) {
                    a += o13.a(2);
                }
                if (this.official) {
                    a += o13.a(3);
                }
                if (this.allCanPinMessage) {
                    a += o13.a(4);
                }
                if (this.onlyAdminCanAddMember) {
                    a += o13.a(5);
                }
                if (this.onlyAdminCanCall) {
                    a += o13.a(7);
                }
                if (this.sentByPhone) {
                    a += o13.a(8);
                }
                if (this.serviceChat) {
                    a += o13.a(9);
                }
                return this.membersCanSeePrivateLink ? a + o13.a(10) : a;
            }

            public void writeTo(o13 o13) throws IOException {
                boolean z = this.signAdmin;
                if (z) {
                    o13.r(1, z);
                }
                boolean z2 = this.onlyOwnerCanChangeIconTitle;
                if (z2) {
                    o13.r(2, z2);
                }
                boolean z3 = this.official;
                if (z3) {
                    o13.r(3, z3);
                }
                boolean z4 = this.allCanPinMessage;
                if (z4) {
                    o13.r(4, z4);
                }
                boolean z5 = this.onlyAdminCanAddMember;
                if (z5) {
                    o13.r(5, z5);
                }
                boolean z6 = this.onlyAdminCanCall;
                if (z6) {
                    o13.r(7, z6);
                }
                boolean z7 = this.sentByPhone;
                if (z7) {
                    o13.r(8, z7);
                }
                boolean z8 = this.serviceChat;
                if (z8) {
                    o13.r(9, z8);
                }
                boolean z9 = this.membersCanSeePrivateLink;
                if (z9) {
                    o13.r(10, z9);
                }
            }

            public static ChatOptions parseFrom(n13 n13) throws IOException {
                return new ChatOptions().mergeFrom(n13);
            }

            public ChatOptions mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.signAdmin = n13.f();
                    } else if (s == 16) {
                        this.onlyOwnerCanChangeIconTitle = n13.f();
                    } else if (s == 24) {
                        this.official = n13.f();
                    } else if (s == 32) {
                        this.allCanPinMessage = n13.f();
                    } else if (s == 40) {
                        this.onlyAdminCanAddMember = n13.f();
                    } else if (s == 56) {
                        this.onlyAdminCanCall = n13.f();
                    } else if (s == 64) {
                        this.sentByPhone = n13.f();
                    } else if (s == 72) {
                        this.serviceChat = n13.f();
                    } else if (s == 80) {
                        this.membersCanSeePrivateLink = n13.f();
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChatSettings extends gr8 {
            private static volatile ChatSettings[] _emptyArray;
            public long dontDisturbUntil;
            public long favoriteIndex;
            public boolean hideLiveLocationPanel;
            public long hideLiveLocationPanelBeforeTime;
            public long hideMyLiveLocationPanelBeforeTime;
            public long lastNotifMark;
            public long lastNotifMessageId;
            public int[] options;

            public ChatSettings() {
                clear();
            }

            public static ChatSettings[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatSettings[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new ChatSettings(), bArr);
            }

            public ChatSettings clear() {
                this.dontDisturbUntil = 0;
                this.options = iu7.k;
                this.lastNotifMark = 0;
                this.favoriteIndex = 0;
                this.hideLiveLocationPanel = false;
                this.hideMyLiveLocationPanelBeforeTime = 0;
                this.hideLiveLocationPanelBeforeTime = 0;
                this.lastNotifMessageId = 0;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int[] iArr;
                long j = this.dontDisturbUntil;
                int i = 0;
                int h = j != 0 ? o13.h(1, j) : 0;
                int[] iArr2 = this.options;
                if (iArr2 != null && iArr2.length > 0) {
                    int i2 = 0;
                    while (true) {
                        iArr = this.options;
                        if (i >= iArr.length) {
                            break;
                        }
                        i2 += o13.g(iArr[i]);
                        i++;
                    }
                    h = h + i2 + iArr.length;
                }
                long j2 = this.lastNotifMark;
                if (j2 != 0) {
                    h += o13.h(3, j2);
                }
                long j3 = this.favoriteIndex;
                if (j3 != 0) {
                    h += o13.h(4, j3);
                }
                if (this.hideLiveLocationPanel) {
                    h += o13.a(6);
                }
                long j4 = this.hideMyLiveLocationPanelBeforeTime;
                if (j4 != 0) {
                    h += o13.h(7, j4);
                }
                long j5 = this.hideLiveLocationPanelBeforeTime;
                if (j5 != 0) {
                    h += o13.h(8, j5);
                }
                long j6 = this.lastNotifMessageId;
                return j6 != 0 ? h + o13.h(9, j6) : h;
            }

            public void writeTo(o13 o13) throws IOException {
                long j = this.dontDisturbUntil;
                if (j != 0) {
                    o13.x(1, j);
                }
                int[] iArr = this.options;
                if (iArr != null && iArr.length > 0) {
                    int i = 0;
                    while (true) {
                        int[] iArr2 = this.options;
                        if (i >= iArr2.length) {
                            break;
                        }
                        o13.w(2, iArr2[i]);
                        i++;
                    }
                }
                long j2 = this.lastNotifMark;
                if (j2 != 0) {
                    o13.x(3, j2);
                }
                long j3 = this.favoriteIndex;
                if (j3 != 0) {
                    o13.x(4, j3);
                }
                boolean z = this.hideLiveLocationPanel;
                if (z) {
                    o13.r(6, z);
                }
                long j4 = this.hideMyLiveLocationPanelBeforeTime;
                if (j4 != 0) {
                    o13.x(7, j4);
                }
                long j5 = this.hideLiveLocationPanelBeforeTime;
                if (j5 != 0) {
                    o13.x(8, j5);
                }
                long j6 = this.lastNotifMessageId;
                if (j6 != 0) {
                    o13.x(9, j6);
                }
            }

            public static ChatSettings parseFrom(n13 n13) throws IOException {
                return new ChatSettings().mergeFrom(n13);
            }

            public ChatSettings mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.dontDisturbUntil = n13.q();
                    } else if (s == 16) {
                        int z = iu7.z(n13, 16);
                        int[] iArr = new int[z];
                        int i = 0;
                        for (int i2 = 0; i2 < z; i2++) {
                            if (i2 != 0) {
                                n13.s();
                            }
                            int p = n13.p();
                            if (p == 0 || p == 1 || p == 2) {
                                iArr[i] = p;
                                i++;
                            }
                        }
                        if (i != 0) {
                            int[] iArr2 = this.options;
                            int length = iArr2 == null ? 0 : iArr2.length;
                            if (length == 0 && i == z) {
                                this.options = iArr;
                            } else {
                                int[] iArr3 = new int[(length + i)];
                                if (length != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length);
                                }
                                System.arraycopy(iArr, 0, iArr3, length, i);
                                this.options = iArr3;
                            }
                        }
                    } else if (s == 18) {
                        int e = n13.e(n13.p());
                        int c = n13.c();
                        int i3 = 0;
                        while (n13.b() > 0) {
                            int p2 = n13.p();
                            if (p2 == 0 || p2 == 1 || p2 == 2) {
                                i3++;
                            }
                        }
                        if (i3 != 0) {
                            n13.t(c);
                            int[] iArr4 = this.options;
                            int length2 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[(i3 + length2)];
                            if (length2 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length2);
                            }
                            while (n13.b() > 0) {
                                int p3 = n13.p();
                                if (p3 == 0 || p3 == 1 || p3 == 2) {
                                    iArr5[length2] = p3;
                                    length2++;
                                }
                            }
                            this.options = iArr5;
                        }
                        n13.d(e);
                    } else if (s == 24) {
                        this.lastNotifMark = n13.q();
                    } else if (s == 32) {
                        this.favoriteIndex = n13.q();
                    } else if (s == 48) {
                        this.hideLiveLocationPanel = n13.f();
                    } else if (s == 56) {
                        this.hideMyLiveLocationPanelBeforeTime = n13.q();
                    } else if (s == 64) {
                        this.hideLiveLocationPanelBeforeTime = n13.q();
                    } else if (s == 72) {
                        this.lastNotifMessageId = n13.q();
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChatSubject extends gr8 {
            private static volatile ChatSubject[] _emptyArray;
            public long[] organizationIds;

            public ChatSubject() {
                clear();
            }

            public static ChatSubject[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatSubject[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatSubject parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new ChatSubject(), bArr);
            }

            public ChatSubject clear() {
                this.organizationIds = iu7.l;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long[] jArr = this.organizationIds;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.organizationIds;
                    if (i >= jArr2.length) {
                        return i2 + jArr2.length;
                    }
                    i2 += o13.k(jArr2[i]);
                    i++;
                }
            }

            public void writeTo(o13 o13) throws IOException {
                long[] jArr = this.organizationIds;
                if (jArr != null && jArr.length > 0) {
                    int i = 0;
                    while (true) {
                        long[] jArr2 = this.organizationIds;
                        if (i < jArr2.length) {
                            o13.x(1, jArr2[i]);
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            }

            public static ChatSubject parseFrom(n13 n13) throws IOException {
                return new ChatSubject().mergeFrom(n13);
            }

            public ChatSubject mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        int z = iu7.z(n13, 8);
                        long[] jArr = this.organizationIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = z + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = n13.q();
                            n13.s();
                            length++;
                        }
                        jArr2[length] = n13.q();
                        this.organizationIds = jArr2;
                    } else if (s == 10) {
                        int e = n13.e(n13.p());
                        int c = n13.c();
                        int i2 = 0;
                        while (n13.b() > 0) {
                            n13.q();
                            i2++;
                        }
                        n13.t(c);
                        long[] jArr3 = this.organizationIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = n13.q();
                            length2++;
                        }
                        this.organizationIds = jArr4;
                        n13.d(e);
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class Chunk extends gr8 {
            private static volatile Chunk[] _emptyArray;
            public long endTime;
            public long startTime;

            public Chunk() {
                clear();
            }

            public static Chunk[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Chunk[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static Chunk parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new Chunk(), bArr);
            }

            public Chunk clear() {
                this.startTime = 0;
                this.endTime = 0;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long j = this.startTime;
                int h = j != 0 ? o13.h(1, j) : 0;
                long j2 = this.endTime;
                return j2 != 0 ? h + o13.h(2, j2) : h;
            }

            public void writeTo(o13 o13) throws IOException {
                long j = this.startTime;
                if (j != 0) {
                    o13.x(1, j);
                }
                long j2 = this.endTime;
                if (j2 != 0) {
                    o13.x(2, j2);
                }
            }

            public static Chunk parseFrom(n13 n13) throws IOException {
                return new Chunk().mergeFrom(n13);
            }

            public Chunk mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.startTime = n13.q();
                    } else if (s == 16) {
                        this.endTime = n13.q();
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class GroupChatInfo extends gr8 {
            public static final int ALL = 2;
            public static final int DISABLED = 0;
            public static final int MEMBERS = 1;
            private static volatile GroupChatInfo[] _emptyArray;
            public String baseIconUrl;
            public long groupId;
            public GroupOptions groupOptions;
            public boolean isAnswered;
            public boolean isCustomTitle;
            public boolean isImportant;
            public boolean isMember;
            public boolean isModerator;
            public int messagingPermissions;
            public String name;

            public static final class GroupOptions extends gr8 {
                private static volatile GroupOptions[] _emptyArray;
                public boolean groupPremium;

                public GroupOptions() {
                    clear();
                }

                public static GroupOptions[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (tz6.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new GroupOptions[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static GroupOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return gr8.mergeFrom(new GroupOptions(), bArr);
                }

                public GroupOptions clear() {
                    this.groupPremium = false;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    if (this.groupPremium) {
                        return o13.a(1);
                    }
                    return 0;
                }

                public void writeTo(o13 o13) throws IOException {
                    boolean z = this.groupPremium;
                    if (z) {
                        o13.r(1, z);
                    }
                }

                public static GroupOptions parseFrom(n13 n13) throws IOException {
                    return new GroupOptions().mergeFrom(n13);
                }

                public GroupOptions mergeFrom(n13 n13) throws IOException {
                    while (true) {
                        int s = n13.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 8) {
                            this.groupPremium = n13.f();
                        } else if (!n13.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public GroupChatInfo() {
                clear();
            }

            public static GroupChatInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new GroupChatInfo[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static GroupChatInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new GroupChatInfo(), bArr);
            }

            public GroupChatInfo clear() {
                this.groupId = 0;
                this.isAnswered = false;
                this.isModerator = false;
                this.isImportant = false;
                this.name = "";
                this.baseIconUrl = "";
                this.isCustomTitle = false;
                this.isMember = false;
                this.messagingPermissions = 0;
                this.groupOptions = null;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long j = this.groupId;
                int h = j != 0 ? o13.h(1, j) : 0;
                if (this.isAnswered) {
                    h += o13.a(2);
                }
                if (this.isModerator) {
                    h += o13.a(3);
                }
                if (this.isImportant) {
                    h += o13.a(4);
                }
                if (!this.name.equals("")) {
                    h += o13.l(5, this.name);
                }
                if (!this.baseIconUrl.equals("")) {
                    h += o13.l(6, this.baseIconUrl);
                }
                if (this.isCustomTitle) {
                    h += o13.a(7);
                }
                if (this.isMember) {
                    h += o13.a(8);
                }
                int i = this.messagingPermissions;
                if (i != 0) {
                    h += o13.f(9, i);
                }
                GroupOptions groupOptions2 = this.groupOptions;
                return groupOptions2 != null ? h + o13.i(10, groupOptions2) : h;
            }

            public void writeTo(o13 o13) throws IOException {
                long j = this.groupId;
                if (j != 0) {
                    o13.x(1, j);
                }
                boolean z = this.isAnswered;
                if (z) {
                    o13.r(2, z);
                }
                boolean z2 = this.isModerator;
                if (z2) {
                    o13.r(3, z2);
                }
                boolean z3 = this.isImportant;
                if (z3) {
                    o13.r(4, z3);
                }
                if (!this.name.equals("")) {
                    o13.E(5, this.name);
                }
                if (!this.baseIconUrl.equals("")) {
                    o13.E(6, this.baseIconUrl);
                }
                boolean z4 = this.isCustomTitle;
                if (z4) {
                    o13.r(7, z4);
                }
                boolean z5 = this.isMember;
                if (z5) {
                    o13.r(8, z5);
                }
                int i = this.messagingPermissions;
                if (i != 0) {
                    o13.w(9, i);
                }
                GroupOptions groupOptions2 = this.groupOptions;
                if (groupOptions2 != null) {
                    o13.y(10, groupOptions2);
                }
            }

            public static GroupChatInfo parseFrom(n13 n13) throws IOException {
                return new GroupChatInfo().mergeFrom(n13);
            }

            public GroupChatInfo mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    switch (s) {
                        case 0:
                            return this;
                        case 8:
                            this.groupId = n13.q();
                            break;
                        case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                            this.isAnswered = n13.f();
                            break;
                        case 24:
                            this.isModerator = n13.f();
                            break;
                        case 32:
                            this.isImportant = n13.f();
                            break;
                        case 42:
                            this.name = n13.r();
                            break;
                        case 50:
                            this.baseIconUrl = n13.r();
                            break;
                        case 56:
                            this.isCustomTitle = n13.f();
                            break;
                        case EglBase.EGL_OPENGL_ES3_BIT:
                            this.isMember = n13.f();
                            break;
                        case 72:
                            int p = n13.p();
                            if (p != 0 && p != 1 && p != 2) {
                                break;
                            } else {
                                this.messagingPermissions = p;
                                break;
                            }
                        case 82:
                            if (this.groupOptions == null) {
                                this.groupOptions = new GroupOptions();
                            }
                            n13.j(this.groupOptions);
                            break;
                        default:
                            if (n13.u(s)) {
                                break;
                            } else {
                                return this;
                            }
                    }
                }
            }
        }

        public static final class LastInputMedia extends gr8 {
            private static volatile LastInputMedia[] _emptyArray;
            public String attachLocalId;
            public long dateModified;
            public String editedUri;
            public String mimeType;
            public long originalDuration;
            public long originalId;
            public int originalOrientation;
            public String originalUri;
            public String thumbnailUri;
            public int type;
            public int[] wave;

            public LastInputMedia() {
                clear();
            }

            public static LastInputMedia[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LastInputMedia[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static LastInputMedia parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new LastInputMedia(), bArr);
            }

            public LastInputMedia clear() {
                this.originalId = 0;
                this.originalUri = "";
                this.thumbnailUri = "";
                this.originalOrientation = 0;
                this.originalDuration = 0;
                this.mimeType = "";
                this.dateModified = 0;
                this.editedUri = "";
                this.type = 0;
                this.wave = iu7.k;
                this.attachLocalId = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int[] iArr;
                long j = this.originalId;
                int i = 0;
                int h = j != 0 ? o13.h(1, j) : 0;
                if (!this.originalUri.equals("")) {
                    h += o13.l(2, this.originalUri);
                }
                if (!this.thumbnailUri.equals("")) {
                    h += o13.l(3, this.thumbnailUri);
                }
                int i2 = this.originalOrientation;
                if (i2 != 0) {
                    h += o13.f(4, i2);
                }
                long j2 = this.originalDuration;
                if (j2 != 0) {
                    h += o13.h(5, j2);
                }
                if (!this.mimeType.equals("")) {
                    h += o13.l(6, this.mimeType);
                }
                long j3 = this.dateModified;
                if (j3 != 0) {
                    h += o13.h(7, j3);
                }
                if (!this.editedUri.equals("")) {
                    h += o13.l(8, this.editedUri);
                }
                int i3 = this.type;
                if (i3 != 0) {
                    h += o13.f(9, i3);
                }
                int[] iArr2 = this.wave;
                if (iArr2 != null && iArr2.length > 0) {
                    int i4 = 0;
                    while (true) {
                        iArr = this.wave;
                        if (i >= iArr.length) {
                            break;
                        }
                        i4 += o13.g(iArr[i]);
                        i++;
                    }
                    h = h + i4 + iArr.length;
                }
                return !this.attachLocalId.equals("") ? h + o13.l(12, this.attachLocalId) : h;
            }

            public void writeTo(o13 o13) throws IOException {
                long j = this.originalId;
                if (j != 0) {
                    o13.x(1, j);
                }
                if (!this.originalUri.equals("")) {
                    o13.E(2, this.originalUri);
                }
                if (!this.thumbnailUri.equals("")) {
                    o13.E(3, this.thumbnailUri);
                }
                int i = this.originalOrientation;
                if (i != 0) {
                    o13.w(4, i);
                }
                long j2 = this.originalDuration;
                if (j2 != 0) {
                    o13.x(5, j2);
                }
                if (!this.mimeType.equals("")) {
                    o13.E(6, this.mimeType);
                }
                long j3 = this.dateModified;
                if (j3 != 0) {
                    o13.x(7, j3);
                }
                if (!this.editedUri.equals("")) {
                    o13.E(8, this.editedUri);
                }
                int i2 = this.type;
                if (i2 != 0) {
                    o13.w(9, i2);
                }
                int[] iArr = this.wave;
                if (iArr != null && iArr.length > 0) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr2 = this.wave;
                        if (i3 >= iArr2.length) {
                            break;
                        }
                        o13.w(11, iArr2[i3]);
                        i3++;
                    }
                }
                if (!this.attachLocalId.equals("")) {
                    o13.E(12, this.attachLocalId);
                }
            }

            public static LastInputMedia parseFrom(n13 n13) throws IOException {
                return new LastInputMedia().mergeFrom(n13);
            }

            public LastInputMedia mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    switch (s) {
                        case 0:
                            return this;
                        case 8:
                            this.originalId = n13.q();
                            break;
                        case 18:
                            this.originalUri = n13.r();
                            break;
                        case 26:
                            this.thumbnailUri = n13.r();
                            break;
                        case 32:
                            this.originalOrientation = n13.p();
                            break;
                        case 40:
                            this.originalDuration = n13.q();
                            break;
                        case 50:
                            this.mimeType = n13.r();
                            break;
                        case 56:
                            this.dateModified = n13.q();
                            break;
                        case 66:
                            this.editedUri = n13.r();
                            break;
                        case 72:
                            this.type = n13.p();
                            break;
                        case 88:
                            int z = iu7.z(n13, 88);
                            int[] iArr = this.wave;
                            int length = iArr == null ? 0 : iArr.length;
                            int i = z + length;
                            int[] iArr2 = new int[i];
                            if (length != 0) {
                                System.arraycopy(iArr, 0, iArr2, 0, length);
                            }
                            while (length < i - 1) {
                                iArr2[length] = n13.p();
                                n13.s();
                                length++;
                            }
                            iArr2[length] = n13.p();
                            this.wave = iArr2;
                            break;
                        case 90:
                            int e = n13.e(n13.p());
                            int c = n13.c();
                            int i2 = 0;
                            while (n13.b() > 0) {
                                n13.p();
                                i2++;
                            }
                            n13.t(c);
                            int[] iArr3 = this.wave;
                            int length2 = iArr3 == null ? 0 : iArr3.length;
                            int i3 = i2 + length2;
                            int[] iArr4 = new int[i3];
                            if (length2 != 0) {
                                System.arraycopy(iArr3, 0, iArr4, 0, length2);
                            }
                            while (length2 < i3) {
                                iArr4[length2] = n13.p();
                                length2++;
                            }
                            this.wave = iArr4;
                            n13.d(e);
                            break;
                        case 98:
                            this.attachLocalId = n13.r();
                            break;
                        default:
                            if (n13.u(s)) {
                                break;
                            } else {
                                return this;
                            }
                    }
                }
            }
        }

        public static final class PushMessage extends gr8 {
            private static volatile PushMessage[] _emptyArray;
            public long id;
            public String text;
            public long time;

            public PushMessage() {
                clear();
            }

            public static PushMessage[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new PushMessage[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static PushMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new PushMessage(), bArr);
            }

            public PushMessage clear() {
                this.id = 0;
                this.time = 0;
                this.text = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long j = this.id;
                int h = j != 0 ? o13.h(1, j) : 0;
                long j2 = this.time;
                if (j2 != 0) {
                    h += o13.h(2, j2);
                }
                return !this.text.equals("") ? h + o13.l(3, this.text) : h;
            }

            public void writeTo(o13 o13) throws IOException {
                long j = this.id;
                if (j != 0) {
                    o13.x(1, j);
                }
                long j2 = this.time;
                if (j2 != 0) {
                    o13.x(2, j2);
                }
                if (!this.text.equals("")) {
                    o13.E(3, this.text);
                }
            }

            public static PushMessage parseFrom(n13 n13) throws IOException {
                return new PushMessage().mergeFrom(n13);
            }

            public PushMessage mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.id = n13.q();
                    } else if (s == 16) {
                        this.time = n13.q();
                    } else if (s == 26) {
                        this.text = n13.r();
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class Section extends gr8 {
            private static volatile Section[] _emptyArray;
            public boolean collapsed;
            public String id;
            public long marker;
            public long[] stickerSets;
            public long[] stickers;
            public String title;
            public int totalCount;

            public Section() {
                clear();
            }

            public static Section[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Section[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static Section parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new Section(), bArr);
            }

            public Section clear() {
                this.id = "";
                this.title = "";
                long[] jArr = iu7.l;
                this.stickers = jArr;
                this.marker = 0;
                this.collapsed = false;
                this.stickerSets = jArr;
                this.totalCount = 0;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long[] jArr;
                long[] jArr2;
                int i = 0;
                int l = !this.id.equals("") ? o13.l(1, this.id) : 0;
                if (!this.title.equals("")) {
                    l += o13.l(2, this.title);
                }
                long[] jArr3 = this.stickers;
                if (jArr3 != null && jArr3.length > 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        jArr2 = this.stickers;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        i3 += o13.k(jArr2[i2]);
                        i2++;
                    }
                    l = l + i3 + jArr2.length;
                }
                long j = this.marker;
                if (j != 0) {
                    l += o13.h(4, j);
                }
                if (this.collapsed) {
                    l += o13.a(5);
                }
                long[] jArr4 = this.stickerSets;
                if (jArr4 != null && jArr4.length > 0) {
                    int i4 = 0;
                    while (true) {
                        jArr = this.stickerSets;
                        if (i >= jArr.length) {
                            break;
                        }
                        i4 += o13.k(jArr[i]);
                        i++;
                    }
                    l = l + i4 + jArr.length;
                }
                int i5 = this.totalCount;
                return i5 != 0 ? l + o13.f(7, i5) : l;
            }

            public void writeTo(o13 o13) throws IOException {
                if (!this.id.equals("")) {
                    o13.E(1, this.id);
                }
                if (!this.title.equals("")) {
                    o13.E(2, this.title);
                }
                long[] jArr = this.stickers;
                int i = 0;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.stickers;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        o13.x(3, jArr2[i2]);
                        i2++;
                    }
                }
                long j = this.marker;
                if (j != 0) {
                    o13.x(4, j);
                }
                boolean z = this.collapsed;
                if (z) {
                    o13.r(5, z);
                }
                long[] jArr3 = this.stickerSets;
                if (jArr3 != null && jArr3.length > 0) {
                    while (true) {
                        long[] jArr4 = this.stickerSets;
                        if (i >= jArr4.length) {
                            break;
                        }
                        o13.x(6, jArr4[i]);
                        i++;
                    }
                }
                int i3 = this.totalCount;
                if (i3 != 0) {
                    o13.w(7, i3);
                }
            }

            public static Section parseFrom(n13 n13) throws IOException {
                return new Section().mergeFrom(n13);
            }

            public Section mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 10) {
                        this.id = n13.r();
                    } else if (s == 18) {
                        this.title = n13.r();
                    } else if (s == 24) {
                        int z = iu7.z(n13, 24);
                        long[] jArr = this.stickers;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = z + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = n13.q();
                            n13.s();
                            length++;
                        }
                        jArr2[length] = n13.q();
                        this.stickers = jArr2;
                    } else if (s == 26) {
                        int e = n13.e(n13.p());
                        int c = n13.c();
                        int i2 = 0;
                        while (n13.b() > 0) {
                            n13.q();
                            i2++;
                        }
                        n13.t(c);
                        long[] jArr3 = this.stickers;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = n13.q();
                            length2++;
                        }
                        this.stickers = jArr4;
                        n13.d(e);
                    } else if (s == 32) {
                        this.marker = n13.q();
                    } else if (s == 40) {
                        this.collapsed = n13.f();
                    } else if (s == 48) {
                        int z2 = iu7.z(n13, 48);
                        long[] jArr5 = this.stickerSets;
                        int length3 = jArr5 == null ? 0 : jArr5.length;
                        int i4 = z2 + length3;
                        long[] jArr6 = new long[i4];
                        if (length3 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            jArr6[length3] = n13.q();
                            n13.s();
                            length3++;
                        }
                        jArr6[length3] = n13.q();
                        this.stickerSets = jArr6;
                    } else if (s == 50) {
                        int e2 = n13.e(n13.p());
                        int c2 = n13.c();
                        int i5 = 0;
                        while (n13.b() > 0) {
                            n13.q();
                            i5++;
                        }
                        n13.t(c2);
                        long[] jArr7 = this.stickerSets;
                        int length4 = jArr7 == null ? 0 : jArr7.length;
                        int i6 = i5 + length4;
                        long[] jArr8 = new long[i6];
                        if (length4 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            jArr8[length4] = n13.q();
                            length4++;
                        }
                        this.stickerSets = jArr8;
                        n13.d(e2);
                    } else if (s == 56) {
                        this.totalCount = n13.p();
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class VideoConversation extends gr8 {
            public static final int BY_LINK = 1;
            public static final int FROM_CHAT = 2;
            public static final int UNKNOWN = 0;
            private static volatile VideoConversation[] _emptyArray;
            public int approxParticipantCount;
            public String conversationId;
            public String joinLink;
            public long[] previewParticipantIds;
            public long startedAt;
            public int type;

            public VideoConversation() {
                clear();
            }

            public static VideoConversation[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new VideoConversation[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static VideoConversation parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new VideoConversation(), bArr);
            }

            public VideoConversation clear() {
                this.conversationId = "";
                this.startedAt = 0;
                this.joinLink = "";
                this.approxParticipantCount = 0;
                this.previewParticipantIds = iu7.l;
                this.type = 0;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long[] jArr;
                int i = 0;
                int l = !this.conversationId.equals("") ? o13.l(1, this.conversationId) : 0;
                long j = this.startedAt;
                if (j != 0) {
                    l += o13.h(2, j);
                }
                if (!this.joinLink.equals("")) {
                    l += o13.l(3, this.joinLink);
                }
                int i2 = this.approxParticipantCount;
                if (i2 != 0) {
                    l += o13.f(4, i2);
                }
                long[] jArr2 = this.previewParticipantIds;
                if (jArr2 != null && jArr2.length > 0) {
                    int i3 = 0;
                    while (true) {
                        jArr = this.previewParticipantIds;
                        if (i >= jArr.length) {
                            break;
                        }
                        i3 += o13.k(jArr[i]);
                        i++;
                    }
                    l = l + i3 + jArr.length;
                }
                int i4 = this.type;
                return i4 != 0 ? l + o13.f(6, i4) : l;
            }

            public void writeTo(o13 o13) throws IOException {
                if (!this.conversationId.equals("")) {
                    o13.E(1, this.conversationId);
                }
                long j = this.startedAt;
                if (j != 0) {
                    o13.x(2, j);
                }
                if (!this.joinLink.equals("")) {
                    o13.E(3, this.joinLink);
                }
                int i = this.approxParticipantCount;
                if (i != 0) {
                    o13.w(4, i);
                }
                long[] jArr = this.previewParticipantIds;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.previewParticipantIds;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        o13.x(5, jArr2[i2]);
                        i2++;
                    }
                }
                int i3 = this.type;
                if (i3 != 0) {
                    o13.w(6, i3);
                }
            }

            public static VideoConversation parseFrom(n13 n13) throws IOException {
                return new VideoConversation().mergeFrom(n13);
            }

            public VideoConversation mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 10) {
                        this.conversationId = n13.r();
                    } else if (s == 16) {
                        this.startedAt = n13.q();
                    } else if (s == 26) {
                        this.joinLink = n13.r();
                    } else if (s == 32) {
                        this.approxParticipantCount = n13.p();
                    } else if (s == 40) {
                        int z = iu7.z(n13, 40);
                        long[] jArr = this.previewParticipantIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = z + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = n13.q();
                            n13.s();
                            length++;
                        }
                        jArr2[length] = n13.q();
                        this.previewParticipantIds = jArr2;
                    } else if (s == 42) {
                        int e = n13.e(n13.p());
                        int c = n13.c();
                        int i2 = 0;
                        while (n13.b() > 0) {
                            n13.q();
                            i2++;
                        }
                        n13.t(c);
                        long[] jArr3 = this.previewParticipantIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = n13.q();
                            length2++;
                        }
                        this.previewParticipantIds = jArr4;
                        n13.d(e);
                    } else if (s == 48) {
                        int p = n13.p();
                        if (p == 0 || p == 1 || p == 2) {
                            this.type = p;
                        }
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public Chat() {
            clear();
        }

        public static Chat[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Chat[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Chat parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new Chat(), bArr);
        }

        public Chat clear() {
            this.serverId = 0;
            this.type = 0;
            this.status = 0;
            this.owner = 0;
            this.participants = null;
            this.created = 0;
            this.title = "";
            this.lastMessageId = 0;
            this.lastEventTime = 0;
            this.cid = 0;
            this.newMessages = 0;
            this.chunk = Chunk.emptyArray();
            this.lastInput = "";
            this.chatSettings = null;
            this.mediaAll = null;
            this.firstMessageId = 0;
            this.sections = Section.emptyArray();
            this.stickersOrder = iu7.n;
            this.stickersSyncTime = 0;
            this.localChanges = iu7.k;
            this.channelInfo = null;
            this.accessType = 0;
            this.link = "";
            this.chatSubject = null;
            this.restrictions = 0;
            this.groupChatInfo = null;
            this.participantsCount = 0;
            this.description = "";
            long[] jArr = iu7.l;
            this.admins = jArr;
            this.blockedParticipantsCount = 0;
            this.chatOptions = null;
            this.mediaMusic = null;
            this.mediaAudio = null;
            this.pinnedMessageId = 0;
            this.hidePinnedMessage = false;
            this.unreadReply = false;
            this.unreadPin = false;
            this.joinTime = 0;
            this.messagesTtlSec = 0;
            this.adminParticipants = null;
            this.baseIconUrl = "";
            this.baseRawIconUrl = "";
            this.unbindOkPanelCloseTime = 0;
            this.flagsSettings = 0;
            this.videoConversation = null;
            this.lastOpenPositionTime = 0;
            this.lastOpenPositionOffset = 0;
            this.lastOpenReadMark = 0;
            this.lastWriteTime = 0;
            this.lastSearchClickTime = 0;
            this.lastOpenNewMessages = 0;
            this.lastInputMedia = LastInputMedia.emptyArray();
            this.mediaPhotoVideo = null;
            this.mediaShare = null;
            this.mediaFiles = null;
            this.botsInfo = null;
            this.mediaLocations = null;
            this.lastInputEditMessageId = 0;
            this.modified = 0;
            this.lastInputReplyMessageId = 0;
            this.draft = iu7.o;
            this.draftUpdateTime = 0;
            this.subscribedToUpdates = false;
            this.liveLocationMessageIds = null;
            this.lastMentionMessageId = 0;
            this.chatFoldersIds = jArr;
            this.draftUpdateTimeForSyncLogic = 0;
            this.markedAsUnread = false;
            this.lastPushMessage = null;
            this.lastReactedMessageId = 0;
            this.lastReaction = "";
            this.lastFireDelayedErrorTime = 0;
            this.lastDelayedUpdateTime = 0;
            this.delayedChunk = Chunk.emptyArray();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long[] jArr;
            long[] jArr2;
            int[] iArr;
            long j = this.serverId;
            int i = 0;
            int h = j != 0 ? o13.h(1, j) : 0;
            int i2 = this.type;
            if (i2 != 0) {
                h += o13.f(2, i2);
            }
            int i3 = this.status;
            if (i3 != 0) {
                h += o13.f(3, i3);
            }
            long j2 = this.owner;
            if (j2 != 0) {
                h += o13.h(4, j2);
            }
            Map<Long, Long> map = this.participants;
            if (map != null) {
                h += tz6.a(map, 5, 3, 3);
            }
            long j3 = this.created;
            if (j3 != 0) {
                h += o13.h(6, j3);
            }
            if (!this.title.equals("")) {
                h += o13.l(7, this.title);
            }
            long j4 = this.lastMessageId;
            if (j4 != 0) {
                h += o13.h(10, j4);
            }
            long j5 = this.lastEventTime;
            if (j5 != 0) {
                h += o13.h(11, j5);
            }
            long j6 = this.cid;
            if (j6 != 0) {
                h += o13.h(12, j6);
            }
            int i4 = this.newMessages;
            if (i4 != 0) {
                h += o13.f(13, i4);
            }
            Chunk[] chunkArr = this.chunk;
            if (chunkArr != null && chunkArr.length > 0) {
                int i5 = 0;
                while (true) {
                    gr8[] gr8Arr = this.chunk;
                    if (i5 >= gr8Arr.length) {
                        break;
                    }
                    gr8 gr8 = gr8Arr[i5];
                    if (gr8 != null) {
                        h = o13.i(14, gr8) + h;
                    }
                    i5++;
                }
            }
            if (!this.lastInput.equals("")) {
                h += o13.l(15, this.lastInput);
            }
            ChatSettings chatSettings2 = this.chatSettings;
            if (chatSettings2 != null) {
                h += o13.i(16, chatSettings2);
            }
            ChatMedia chatMedia = this.mediaAll;
            if (chatMedia != null) {
                h += o13.i(17, chatMedia);
            }
            long j7 = this.firstMessageId;
            if (j7 != 0) {
                h += o13.h(18, j7);
            }
            Section[] sectionArr = this.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                int i6 = 0;
                while (true) {
                    gr8[] gr8Arr2 = this.sections;
                    if (i6 >= gr8Arr2.length) {
                        break;
                    }
                    gr8 gr82 = gr8Arr2[i6];
                    if (gr82 != null) {
                        h = o13.i(19, gr82) + h;
                    }
                    i6++;
                }
            }
            String[] strArr = this.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    String[] strArr2 = this.stickersOrder;
                    if (i7 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i7];
                    if (str != null) {
                        i9++;
                        int q = o13.q(str);
                        i8 += o13.j(q) + q;
                    }
                    i7++;
                }
                h = h + i8 + (i9 * 2);
            }
            long j8 = this.stickersSyncTime;
            if (j8 != 0) {
                h += o13.h(21, j8);
            }
            int[] iArr2 = this.localChanges;
            if (iArr2 != null && iArr2.length > 0) {
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    iArr = this.localChanges;
                    if (i10 >= iArr.length) {
                        break;
                    }
                    i11 += o13.g(iArr[i10]);
                    i10++;
                }
                h = h + i11 + (iArr.length * 2);
            }
            ChannelInfo channelInfo2 = this.channelInfo;
            if (channelInfo2 != null) {
                h += o13.i(23, channelInfo2);
            }
            int i12 = this.accessType;
            if (i12 != 0) {
                h += o13.f(24, i12);
            }
            if (!this.link.equals("")) {
                h += o13.l(25, this.link);
            }
            ChatSubject chatSubject2 = this.chatSubject;
            if (chatSubject2 != null) {
                h += o13.i(26, chatSubject2);
            }
            int i13 = this.restrictions;
            if (i13 != 0) {
                h += o13.f(27, i13);
            }
            GroupChatInfo groupChatInfo2 = this.groupChatInfo;
            if (groupChatInfo2 != null) {
                h += o13.i(28, groupChatInfo2);
            }
            int i14 = this.participantsCount;
            if (i14 != 0) {
                h += o13.f(29, i14);
            }
            if (!this.description.equals("")) {
                h += o13.l(30, this.description);
            }
            long[] jArr3 = this.admins;
            if (jArr3 != null && jArr3.length > 0) {
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    jArr2 = this.admins;
                    if (i15 >= jArr2.length) {
                        break;
                    }
                    i16 += o13.k(jArr2[i15]);
                    i15++;
                }
                h = h + i16 + (jArr2.length * 2);
            }
            int i17 = this.blockedParticipantsCount;
            if (i17 != 0) {
                h += o13.f(32, i17);
            }
            ChatOptions chatOptions2 = this.chatOptions;
            if (chatOptions2 != null) {
                h += o13.i(33, chatOptions2);
            }
            ChatMedia chatMedia2 = this.mediaMusic;
            if (chatMedia2 != null) {
                h += o13.i(34, chatMedia2);
            }
            ChatMedia chatMedia3 = this.mediaAudio;
            if (chatMedia3 != null) {
                h += o13.i(35, chatMedia3);
            }
            long j9 = this.pinnedMessageId;
            if (j9 != 0) {
                h += o13.h(36, j9);
            }
            if (this.hidePinnedMessage) {
                h += o13.a(37);
            }
            if (this.unreadReply) {
                h += o13.a(38);
            }
            if (this.unreadPin) {
                h += o13.a(39);
            }
            long j10 = this.joinTime;
            if (j10 != 0) {
                h += o13.h(40, j10);
            }
            int i18 = this.messagesTtlSec;
            if (i18 != 0) {
                h += o13.f(42, i18);
            }
            Map<Long, AdminParticipant> map2 = this.adminParticipants;
            if (map2 != null) {
                h += tz6.a(map2, 43, 3, 11);
            }
            if (!this.baseIconUrl.equals("")) {
                h += o13.l(44, this.baseIconUrl);
            }
            if (!this.baseRawIconUrl.equals("")) {
                h += o13.l(45, this.baseRawIconUrl);
            }
            long j11 = this.unbindOkPanelCloseTime;
            if (j11 != 0) {
                h += o13.h(46, j11);
            }
            int i19 = this.flagsSettings;
            if (i19 != 0) {
                h += o13.f(47, i19);
            }
            VideoConversation videoConversation2 = this.videoConversation;
            if (videoConversation2 != null) {
                h += o13.i(48, videoConversation2);
            }
            long j12 = this.lastOpenPositionTime;
            if (j12 != 0) {
                h += o13.h(49, j12);
            }
            int i20 = this.lastOpenPositionOffset;
            if (i20 != 0) {
                h += o13.f(50, i20);
            }
            long j13 = this.lastOpenReadMark;
            if (j13 != 0) {
                h += o13.h(51, j13);
            }
            long j14 = this.lastWriteTime;
            if (j14 != 0) {
                h += o13.h(52, j14);
            }
            long j15 = this.lastSearchClickTime;
            if (j15 != 0) {
                h += o13.h(53, j15);
            }
            long j16 = this.lastOpenNewMessages;
            if (j16 != 0) {
                h += o13.h(54, j16);
            }
            LastInputMedia[] lastInputMediaArr = this.lastInputMedia;
            if (lastInputMediaArr != null && lastInputMediaArr.length > 0) {
                int i21 = 0;
                while (true) {
                    gr8[] gr8Arr3 = this.lastInputMedia;
                    if (i21 >= gr8Arr3.length) {
                        break;
                    }
                    gr8 gr83 = gr8Arr3[i21];
                    if (gr83 != null) {
                        h = o13.i(55, gr83) + h;
                    }
                    i21++;
                }
            }
            ChatMedia chatMedia4 = this.mediaPhotoVideo;
            if (chatMedia4 != null) {
                h += o13.i(56, chatMedia4);
            }
            ChatMedia chatMedia5 = this.mediaShare;
            if (chatMedia5 != null) {
                h += o13.i(57, chatMedia5);
            }
            ChatMedia chatMedia6 = this.mediaFiles;
            if (chatMedia6 != null) {
                h += o13.i(58, chatMedia6);
            }
            BotsInfo botsInfo2 = this.botsInfo;
            if (botsInfo2 != null) {
                h += o13.i(59, botsInfo2);
            }
            ChatMedia chatMedia7 = this.mediaLocations;
            if (chatMedia7 != null) {
                h += o13.i(60, chatMedia7);
            }
            long j17 = this.lastInputEditMessageId;
            if (j17 != 0) {
                h += o13.h(61, j17);
            }
            long j18 = this.modified;
            if (j18 != 0) {
                h += o13.h(62, j18);
            }
            long j19 = this.lastInputReplyMessageId;
            if (j19 != 0) {
                h += o13.h(63, j19);
            }
            if (!Arrays.equals(this.draft, iu7.o)) {
                h += o13.b(64, this.draft);
            }
            long j20 = this.draftUpdateTime;
            if (j20 != 0) {
                h += o13.h(65, j20);
            }
            if (this.subscribedToUpdates) {
                h += o13.a(66);
            }
            Map<Long, Long> map3 = this.liveLocationMessageIds;
            if (map3 != null) {
                h += tz6.a(map3, 67, 3, 3);
            }
            long j21 = this.lastMentionMessageId;
            if (j21 != 0) {
                h += o13.h(68, j21);
            }
            long[] jArr4 = this.chatFoldersIds;
            if (jArr4 != null && jArr4.length > 0) {
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    jArr = this.chatFoldersIds;
                    if (i22 >= jArr.length) {
                        break;
                    }
                    i23 += o13.k(jArr[i22]);
                    i22++;
                }
                h = h + i23 + (jArr.length * 2);
            }
            long j22 = this.draftUpdateTimeForSyncLogic;
            if (j22 != 0) {
                h += o13.h(70, j22);
            }
            if (this.markedAsUnread) {
                h += o13.a(71);
            }
            PushMessage pushMessage = this.lastPushMessage;
            if (pushMessage != null) {
                h += o13.i(72, pushMessage);
            }
            long j23 = this.lastReactedMessageId;
            if (j23 != 0) {
                h += o13.h(73, j23);
            }
            if (!this.lastReaction.equals("")) {
                h += o13.l(74, this.lastReaction);
            }
            long j24 = this.lastFireDelayedErrorTime;
            if (j24 != 0) {
                h += o13.h(75, j24);
            }
            long j25 = this.lastDelayedUpdateTime;
            if (j25 != 0) {
                h += o13.h(76, j25);
            }
            Chunk[] chunkArr2 = this.delayedChunk;
            if (chunkArr2 != null && chunkArr2.length > 0) {
                while (true) {
                    gr8[] gr8Arr4 = this.delayedChunk;
                    if (i >= gr8Arr4.length) {
                        break;
                    }
                    gr8 gr84 = gr8Arr4[i];
                    if (gr84 != null) {
                        h = o13.i(77, gr84) + h;
                    }
                    i++;
                }
            }
            return h;
        }

        public void writeTo(o13 o13) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                o13.x(1, j);
            }
            int i = this.type;
            if (i != 0) {
                o13.w(2, i);
            }
            int i2 = this.status;
            if (i2 != 0) {
                o13.w(3, i2);
            }
            long j2 = this.owner;
            if (j2 != 0) {
                o13.x(4, j2);
            }
            Map<Long, Long> map = this.participants;
            if (map != null) {
                tz6.d(o13, map, 5, 3, 3);
            }
            long j3 = this.created;
            if (j3 != 0) {
                o13.x(6, j3);
            }
            if (!this.title.equals("")) {
                o13.E(7, this.title);
            }
            long j4 = this.lastMessageId;
            if (j4 != 0) {
                o13.x(10, j4);
            }
            long j5 = this.lastEventTime;
            if (j5 != 0) {
                o13.x(11, j5);
            }
            long j6 = this.cid;
            if (j6 != 0) {
                o13.x(12, j6);
            }
            int i3 = this.newMessages;
            if (i3 != 0) {
                o13.w(13, i3);
            }
            Chunk[] chunkArr = this.chunk;
            int i4 = 0;
            if (chunkArr != null && chunkArr.length > 0) {
                int i5 = 0;
                while (true) {
                    gr8[] gr8Arr = this.chunk;
                    if (i5 >= gr8Arr.length) {
                        break;
                    }
                    gr8 gr8 = gr8Arr[i5];
                    if (gr8 != null) {
                        o13.y(14, gr8);
                    }
                    i5++;
                }
            }
            if (!this.lastInput.equals("")) {
                o13.E(15, this.lastInput);
            }
            ChatSettings chatSettings2 = this.chatSettings;
            if (chatSettings2 != null) {
                o13.y(16, chatSettings2);
            }
            ChatMedia chatMedia = this.mediaAll;
            if (chatMedia != null) {
                o13.y(17, chatMedia);
            }
            long j7 = this.firstMessageId;
            if (j7 != 0) {
                o13.x(18, j7);
            }
            Section[] sectionArr = this.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                int i6 = 0;
                while (true) {
                    gr8[] gr8Arr2 = this.sections;
                    if (i6 >= gr8Arr2.length) {
                        break;
                    }
                    gr8 gr82 = gr8Arr2[i6];
                    if (gr82 != null) {
                        o13.y(19, gr82);
                    }
                    i6++;
                }
            }
            String[] strArr = this.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                int i7 = 0;
                while (true) {
                    String[] strArr2 = this.stickersOrder;
                    if (i7 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i7];
                    if (str != null) {
                        o13.E(20, str);
                    }
                    i7++;
                }
            }
            long j8 = this.stickersSyncTime;
            if (j8 != 0) {
                o13.x(21, j8);
            }
            int[] iArr = this.localChanges;
            if (iArr != null && iArr.length > 0) {
                int i8 = 0;
                while (true) {
                    int[] iArr2 = this.localChanges;
                    if (i8 >= iArr2.length) {
                        break;
                    }
                    o13.w(22, iArr2[i8]);
                    i8++;
                }
            }
            ChannelInfo channelInfo2 = this.channelInfo;
            if (channelInfo2 != null) {
                o13.y(23, channelInfo2);
            }
            int i9 = this.accessType;
            if (i9 != 0) {
                o13.w(24, i9);
            }
            if (!this.link.equals("")) {
                o13.E(25, this.link);
            }
            ChatSubject chatSubject2 = this.chatSubject;
            if (chatSubject2 != null) {
                o13.y(26, chatSubject2);
            }
            int i10 = this.restrictions;
            if (i10 != 0) {
                o13.w(27, i10);
            }
            GroupChatInfo groupChatInfo2 = this.groupChatInfo;
            if (groupChatInfo2 != null) {
                o13.y(28, groupChatInfo2);
            }
            int i11 = this.participantsCount;
            if (i11 != 0) {
                o13.w(29, i11);
            }
            if (!this.description.equals("")) {
                o13.E(30, this.description);
            }
            long[] jArr = this.admins;
            if (jArr != null && jArr.length > 0) {
                int i12 = 0;
                while (true) {
                    long[] jArr2 = this.admins;
                    if (i12 >= jArr2.length) {
                        break;
                    }
                    o13.x(31, jArr2[i12]);
                    i12++;
                }
            }
            int i13 = this.blockedParticipantsCount;
            if (i13 != 0) {
                o13.w(32, i13);
            }
            ChatOptions chatOptions2 = this.chatOptions;
            if (chatOptions2 != null) {
                o13.y(33, chatOptions2);
            }
            ChatMedia chatMedia2 = this.mediaMusic;
            if (chatMedia2 != null) {
                o13.y(34, chatMedia2);
            }
            ChatMedia chatMedia3 = this.mediaAudio;
            if (chatMedia3 != null) {
                o13.y(35, chatMedia3);
            }
            long j9 = this.pinnedMessageId;
            if (j9 != 0) {
                o13.x(36, j9);
            }
            boolean z = this.hidePinnedMessage;
            if (z) {
                o13.r(37, z);
            }
            boolean z2 = this.unreadReply;
            if (z2) {
                o13.r(38, z2);
            }
            boolean z3 = this.unreadPin;
            if (z3) {
                o13.r(39, z3);
            }
            long j10 = this.joinTime;
            if (j10 != 0) {
                o13.x(40, j10);
            }
            int i14 = this.messagesTtlSec;
            if (i14 != 0) {
                o13.w(42, i14);
            }
            Map<Long, AdminParticipant> map2 = this.adminParticipants;
            if (map2 != null) {
                tz6.d(o13, map2, 43, 3, 11);
            }
            if (!this.baseIconUrl.equals("")) {
                o13.E(44, this.baseIconUrl);
            }
            if (!this.baseRawIconUrl.equals("")) {
                o13.E(45, this.baseRawIconUrl);
            }
            long j11 = this.unbindOkPanelCloseTime;
            if (j11 != 0) {
                o13.x(46, j11);
            }
            int i15 = this.flagsSettings;
            if (i15 != 0) {
                o13.w(47, i15);
            }
            VideoConversation videoConversation2 = this.videoConversation;
            if (videoConversation2 != null) {
                o13.y(48, videoConversation2);
            }
            long j12 = this.lastOpenPositionTime;
            if (j12 != 0) {
                o13.x(49, j12);
            }
            int i16 = this.lastOpenPositionOffset;
            if (i16 != 0) {
                o13.w(50, i16);
            }
            long j13 = this.lastOpenReadMark;
            if (j13 != 0) {
                o13.x(51, j13);
            }
            long j14 = this.lastWriteTime;
            if (j14 != 0) {
                o13.x(52, j14);
            }
            long j15 = this.lastSearchClickTime;
            if (j15 != 0) {
                o13.x(53, j15);
            }
            long j16 = this.lastOpenNewMessages;
            if (j16 != 0) {
                o13.x(54, j16);
            }
            LastInputMedia[] lastInputMediaArr = this.lastInputMedia;
            if (lastInputMediaArr != null && lastInputMediaArr.length > 0) {
                int i17 = 0;
                while (true) {
                    gr8[] gr8Arr3 = this.lastInputMedia;
                    if (i17 >= gr8Arr3.length) {
                        break;
                    }
                    gr8 gr83 = gr8Arr3[i17];
                    if (gr83 != null) {
                        o13.y(55, gr83);
                    }
                    i17++;
                }
            }
            ChatMedia chatMedia4 = this.mediaPhotoVideo;
            if (chatMedia4 != null) {
                o13.y(56, chatMedia4);
            }
            ChatMedia chatMedia5 = this.mediaShare;
            if (chatMedia5 != null) {
                o13.y(57, chatMedia5);
            }
            ChatMedia chatMedia6 = this.mediaFiles;
            if (chatMedia6 != null) {
                o13.y(58, chatMedia6);
            }
            BotsInfo botsInfo2 = this.botsInfo;
            if (botsInfo2 != null) {
                o13.y(59, botsInfo2);
            }
            ChatMedia chatMedia7 = this.mediaLocations;
            if (chatMedia7 != null) {
                o13.y(60, chatMedia7);
            }
            long j17 = this.lastInputEditMessageId;
            if (j17 != 0) {
                o13.x(61, j17);
            }
            long j18 = this.modified;
            if (j18 != 0) {
                o13.x(62, j18);
            }
            long j19 = this.lastInputReplyMessageId;
            if (j19 != 0) {
                o13.x(63, j19);
            }
            if (!Arrays.equals(this.draft, iu7.o)) {
                o13.s(64, this.draft);
            }
            long j20 = this.draftUpdateTime;
            if (j20 != 0) {
                o13.x(65, j20);
            }
            boolean z4 = this.subscribedToUpdates;
            if (z4) {
                o13.r(66, z4);
            }
            Map<Long, Long> map3 = this.liveLocationMessageIds;
            if (map3 != null) {
                tz6.d(o13, map3, 67, 3, 3);
            }
            long j21 = this.lastMentionMessageId;
            if (j21 != 0) {
                o13.x(68, j21);
            }
            long[] jArr3 = this.chatFoldersIds;
            if (jArr3 != null && jArr3.length > 0) {
                int i18 = 0;
                while (true) {
                    long[] jArr4 = this.chatFoldersIds;
                    if (i18 >= jArr4.length) {
                        break;
                    }
                    o13.x(69, jArr4[i18]);
                    i18++;
                }
            }
            long j22 = this.draftUpdateTimeForSyncLogic;
            if (j22 != 0) {
                o13.x(70, j22);
            }
            boolean z5 = this.markedAsUnread;
            if (z5) {
                o13.r(71, z5);
            }
            PushMessage pushMessage = this.lastPushMessage;
            if (pushMessage != null) {
                o13.y(72, pushMessage);
            }
            long j23 = this.lastReactedMessageId;
            if (j23 != 0) {
                o13.x(73, j23);
            }
            if (!this.lastReaction.equals("")) {
                o13.E(74, this.lastReaction);
            }
            long j24 = this.lastFireDelayedErrorTime;
            if (j24 != 0) {
                o13.x(75, j24);
            }
            long j25 = this.lastDelayedUpdateTime;
            if (j25 != 0) {
                o13.x(76, j25);
            }
            Chunk[] chunkArr2 = this.delayedChunk;
            if (chunkArr2 != null && chunkArr2.length > 0) {
                while (true) {
                    gr8[] gr8Arr4 = this.delayedChunk;
                    if (i4 < gr8Arr4.length) {
                        gr8 gr84 = gr8Arr4[i4];
                        if (gr84 != null) {
                            o13.y(77, gr84);
                        }
                        i4++;
                    } else {
                        return;
                    }
                }
            }
        }

        public static Chat parseFrom(n13 n13) throws IOException {
            return new Chat().mergeFrom(n13);
        }

        public Chat mergeFrom(n13 n13) throws IOException {
            mt7 mt7 = xy6.d;
            while (true) {
                int s = n13.s();
                switch (s) {
                    case 0:
                        return this;
                    case 8:
                        this.serverId = n13.q();
                        break;
                    case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                        int p = n13.p();
                        if (p != 0 && p != 1 && p != 2 && p != 3) {
                            break;
                        } else {
                            this.type = p;
                            break;
                        }
                    case 24:
                        int p2 = n13.p();
                        switch (p2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                this.status = p2;
                                break;
                        }
                    case 32:
                        this.owner = n13.q();
                        break;
                    case 42:
                        this.participants = tz6.b(n13, this.participants, mt7, 3, 3, (gr8) null, 8, 16);
                        break;
                    case 48:
                        this.created = n13.q();
                        break;
                    case 58:
                        this.title = n13.r();
                        break;
                    case 80:
                        this.lastMessageId = n13.q();
                        break;
                    case 88:
                        this.lastEventTime = n13.q();
                        break;
                    case 96:
                        this.cid = n13.q();
                        break;
                    case 104:
                        this.newMessages = n13.p();
                        break;
                    case 114:
                        int z = iu7.z(n13, 114);
                        Chunk[] chunkArr = this.chunk;
                        int length = chunkArr == null ? 0 : chunkArr.length;
                        int i = z + length;
                        Chunk[] chunkArr2 = new Chunk[i];
                        if (length != 0) {
                            System.arraycopy(chunkArr, 0, chunkArr2, 0, length);
                        }
                        while (length < i - 1) {
                            Chunk chunk2 = new Chunk();
                            chunkArr2[length] = chunk2;
                            n13.j(chunk2);
                            n13.s();
                            length++;
                        }
                        Chunk chunk3 = new Chunk();
                        chunkArr2[length] = chunk3;
                        n13.j(chunk3);
                        this.chunk = chunkArr2;
                        break;
                    case 122:
                        this.lastInput = n13.r();
                        break;
                    case 130:
                        if (this.chatSettings == null) {
                            this.chatSettings = new ChatSettings();
                        }
                        n13.j(this.chatSettings);
                        break;
                    case 138:
                        if (this.mediaAll == null) {
                            this.mediaAll = new ChatMedia();
                        }
                        n13.j(this.mediaAll);
                        break;
                    case 144:
                        this.firstMessageId = n13.q();
                        break;
                    case 154:
                        int z2 = iu7.z(n13, 154);
                        Section[] sectionArr = this.sections;
                        int length2 = sectionArr == null ? 0 : sectionArr.length;
                        int i2 = z2 + length2;
                        Section[] sectionArr2 = new Section[i2];
                        if (length2 != 0) {
                            System.arraycopy(sectionArr, 0, sectionArr2, 0, length2);
                        }
                        while (length2 < i2 - 1) {
                            Section section = new Section();
                            sectionArr2[length2] = section;
                            n13.j(section);
                            n13.s();
                            length2++;
                        }
                        Section section2 = new Section();
                        sectionArr2[length2] = section2;
                        n13.j(section2);
                        this.sections = sectionArr2;
                        break;
                    case 162:
                        int z3 = iu7.z(n13, 162);
                        String[] strArr = this.stickersOrder;
                        int length3 = strArr == null ? 0 : strArr.length;
                        int i3 = z3 + length3;
                        String[] strArr2 = new String[i3];
                        if (length3 != 0) {
                            System.arraycopy(strArr, 0, strArr2, 0, length3);
                        }
                        while (length3 < i3 - 1) {
                            strArr2[length3] = n13.r();
                            n13.s();
                            length3++;
                        }
                        strArr2[length3] = n13.r();
                        this.stickersOrder = strArr2;
                        break;
                    case 168:
                        this.stickersSyncTime = n13.q();
                        break;
                    case 176:
                        int z4 = iu7.z(n13, 176);
                        int[] iArr = this.localChanges;
                        int length4 = iArr == null ? 0 : iArr.length;
                        int i4 = z4 + length4;
                        int[] iArr2 = new int[i4];
                        if (length4 != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length4);
                        }
                        while (length4 < i4 - 1) {
                            iArr2[length4] = n13.p();
                            n13.s();
                            length4++;
                        }
                        iArr2[length4] = n13.p();
                        this.localChanges = iArr2;
                        break;
                    case 178:
                        int e = n13.e(n13.p());
                        int c = n13.c();
                        int i5 = 0;
                        while (n13.b() > 0) {
                            n13.p();
                            i5++;
                        }
                        n13.t(c);
                        int[] iArr3 = this.localChanges;
                        int length5 = iArr3 == null ? 0 : iArr3.length;
                        int i6 = i5 + length5;
                        int[] iArr4 = new int[i6];
                        if (length5 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length5);
                        }
                        while (length5 < i6) {
                            iArr4[length5] = n13.p();
                            length5++;
                        }
                        this.localChanges = iArr4;
                        n13.d(e);
                        break;
                    case 186:
                        if (this.channelInfo == null) {
                            this.channelInfo = new ChannelInfo();
                        }
                        n13.j(this.channelInfo);
                        break;
                    case 192:
                        int p3 = n13.p();
                        if (p3 != 0 && p3 != 1) {
                            break;
                        } else {
                            this.accessType = p3;
                            break;
                        }
                    case HttpStatus.SC_ACCEPTED:
                        this.link = n13.r();
                        break;
                    case 210:
                        if (this.chatSubject == null) {
                            this.chatSubject = new ChatSubject();
                        }
                        n13.j(this.chatSubject);
                        break;
                    case 216:
                        this.restrictions = n13.p();
                        break;
                    case 226:
                        if (this.groupChatInfo == null) {
                            this.groupChatInfo = new GroupChatInfo();
                        }
                        n13.j(this.groupChatInfo);
                        break;
                    case 232:
                        this.participantsCount = n13.p();
                        break;
                    case 242:
                        this.description = n13.r();
                        break;
                    case 248:
                        int z5 = iu7.z(n13, 248);
                        long[] jArr = this.admins;
                        int length6 = jArr == null ? 0 : jArr.length;
                        int i7 = z5 + length6;
                        long[] jArr2 = new long[i7];
                        if (length6 != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length6);
                        }
                        while (length6 < i7 - 1) {
                            jArr2[length6] = n13.q();
                            n13.s();
                            length6++;
                        }
                        jArr2[length6] = n13.q();
                        this.admins = jArr2;
                        break;
                    case 250:
                        int e2 = n13.e(n13.p());
                        int c2 = n13.c();
                        int i8 = 0;
                        while (n13.b() > 0) {
                            n13.q();
                            i8++;
                        }
                        n13.t(c2);
                        long[] jArr3 = this.admins;
                        int length7 = jArr3 == null ? 0 : jArr3.length;
                        int i9 = i8 + length7;
                        long[] jArr4 = new long[i9];
                        if (length7 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length7);
                        }
                        while (length7 < i9) {
                            jArr4[length7] = n13.q();
                            length7++;
                        }
                        this.admins = jArr4;
                        n13.d(e2);
                        break;
                    case 256:
                        this.blockedParticipantsCount = n13.p();
                        break;
                    case 266:
                        if (this.chatOptions == null) {
                            this.chatOptions = new ChatOptions();
                        }
                        n13.j(this.chatOptions);
                        break;
                    case 274:
                        if (this.mediaMusic == null) {
                            this.mediaMusic = new ChatMedia();
                        }
                        n13.j(this.mediaMusic);
                        break;
                    case 282:
                        if (this.mediaAudio == null) {
                            this.mediaAudio = new ChatMedia();
                        }
                        n13.j(this.mediaAudio);
                        break;
                    case 288:
                        this.pinnedMessageId = n13.q();
                        break;
                    case 296:
                        this.hidePinnedMessage = n13.f();
                        break;
                    case HttpStatus.SC_NOT_MODIFIED:
                        this.unreadReply = n13.f();
                        break;
                    case 312:
                        this.unreadPin = n13.f();
                        break;
                    case 320:
                        this.joinTime = n13.q();
                        break;
                    case 336:
                        this.messagesTtlSec = n13.p();
                        break;
                    case 346:
                        this.adminParticipants = tz6.b(n13, this.adminParticipants, mt7, 3, 11, new AdminParticipant(), 8, 18);
                        break;
                    case 354:
                        this.baseIconUrl = n13.r();
                        break;
                    case 362:
                        this.baseRawIconUrl = n13.r();
                        break;
                    case 368:
                        this.unbindOkPanelCloseTime = n13.q();
                        break;
                    case 376:
                        this.flagsSettings = n13.p();
                        break;
                    case 386:
                        if (this.videoConversation == null) {
                            this.videoConversation = new VideoConversation();
                        }
                        n13.j(this.videoConversation);
                        break;
                    case 392:
                        this.lastOpenPositionTime = n13.q();
                        break;
                    case HttpStatus.SC_BAD_REQUEST:
                        this.lastOpenPositionOffset = n13.p();
                        break;
                    case HttpStatus.SC_REQUEST_TIMEOUT:
                        this.lastOpenReadMark = n13.q();
                        break;
                    case HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE:
                        this.lastWriteTime = n13.q();
                        break;
                    case HttpStatus.SC_FAILED_DEPENDENCY:
                        this.lastSearchClickTime = n13.q();
                        break;
                    case 432:
                        this.lastOpenNewMessages = n13.q();
                        break;
                    case 442:
                        int z6 = iu7.z(n13, 442);
                        LastInputMedia[] lastInputMediaArr = this.lastInputMedia;
                        int length8 = lastInputMediaArr == null ? 0 : lastInputMediaArr.length;
                        int i10 = z6 + length8;
                        LastInputMedia[] lastInputMediaArr2 = new LastInputMedia[i10];
                        if (length8 != 0) {
                            System.arraycopy(lastInputMediaArr, 0, lastInputMediaArr2, 0, length8);
                        }
                        while (length8 < i10 - 1) {
                            LastInputMedia lastInputMedia2 = new LastInputMedia();
                            lastInputMediaArr2[length8] = lastInputMedia2;
                            n13.j(lastInputMedia2);
                            n13.s();
                            length8++;
                        }
                        LastInputMedia lastInputMedia3 = new LastInputMedia();
                        lastInputMediaArr2[length8] = lastInputMedia3;
                        n13.j(lastInputMedia3);
                        this.lastInputMedia = lastInputMediaArr2;
                        break;
                    case 450:
                        if (this.mediaPhotoVideo == null) {
                            this.mediaPhotoVideo = new ChatMedia();
                        }
                        n13.j(this.mediaPhotoVideo);
                        break;
                    case 458:
                        if (this.mediaShare == null) {
                            this.mediaShare = new ChatMedia();
                        }
                        n13.j(this.mediaShare);
                        break;
                    case 466:
                        if (this.mediaFiles == null) {
                            this.mediaFiles = new ChatMedia();
                        }
                        n13.j(this.mediaFiles);
                        break;
                    case 474:
                        if (this.botsInfo == null) {
                            this.botsInfo = new BotsInfo();
                        }
                        n13.j(this.botsInfo);
                        break;
                    case 482:
                        if (this.mediaLocations == null) {
                            this.mediaLocations = new ChatMedia();
                        }
                        n13.j(this.mediaLocations);
                        break;
                    case 488:
                        this.lastInputEditMessageId = n13.q();
                        break;
                    case 496:
                        this.modified = n13.q();
                        break;
                    case HttpStatus.SC_GATEWAY_TIMEOUT:
                        this.lastInputReplyMessageId = n13.q();
                        break;
                    case 514:
                        this.draft = n13.g();
                        break;
                    case 520:
                        this.draftUpdateTime = n13.q();
                        break;
                    case 528:
                        this.subscribedToUpdates = n13.f();
                        break;
                    case 538:
                        this.liveLocationMessageIds = tz6.b(n13, this.liveLocationMessageIds, mt7, 3, 3, (gr8) null, 8, 16);
                        break;
                    case 544:
                        this.lastMentionMessageId = n13.q();
                        break;
                    case 552:
                        int z7 = iu7.z(n13, 552);
                        long[] jArr5 = this.chatFoldersIds;
                        int length9 = jArr5 == null ? 0 : jArr5.length;
                        int i11 = z7 + length9;
                        long[] jArr6 = new long[i11];
                        if (length9 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length9);
                        }
                        while (length9 < i11 - 1) {
                            jArr6[length9] = n13.q();
                            n13.s();
                            length9++;
                        }
                        jArr6[length9] = n13.q();
                        this.chatFoldersIds = jArr6;
                        break;
                    case 554:
                        int e3 = n13.e(n13.p());
                        int c3 = n13.c();
                        int i12 = 0;
                        while (n13.b() > 0) {
                            n13.q();
                            i12++;
                        }
                        n13.t(c3);
                        long[] jArr7 = this.chatFoldersIds;
                        int length10 = jArr7 == null ? 0 : jArr7.length;
                        int i13 = i12 + length10;
                        long[] jArr8 = new long[i13];
                        if (length10 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length10);
                        }
                        while (length10 < i13) {
                            jArr8[length10] = n13.q();
                            length10++;
                        }
                        this.chatFoldersIds = jArr8;
                        n13.d(e3);
                        break;
                    case 560:
                        this.draftUpdateTimeForSyncLogic = n13.q();
                        break;
                    case 568:
                        this.markedAsUnread = n13.f();
                        break;
                    case 578:
                        if (this.lastPushMessage == null) {
                            this.lastPushMessage = new PushMessage();
                        }
                        n13.j(this.lastPushMessage);
                        break;
                    case 584:
                        this.lastReactedMessageId = n13.q();
                        break;
                    case 594:
                        this.lastReaction = n13.r();
                        break;
                    case 600:
                        this.lastFireDelayedErrorTime = n13.q();
                        break;
                    case 608:
                        this.lastDelayedUpdateTime = n13.q();
                        break;
                    case 618:
                        int z8 = iu7.z(n13, 618);
                        Chunk[] chunkArr3 = this.delayedChunk;
                        int length11 = chunkArr3 == null ? 0 : chunkArr3.length;
                        int i14 = z8 + length11;
                        Chunk[] chunkArr4 = new Chunk[i14];
                        if (length11 != 0) {
                            System.arraycopy(chunkArr3, 0, chunkArr4, 0, length11);
                        }
                        while (length11 < i14 - 1) {
                            Chunk chunk4 = new Chunk();
                            chunkArr4[length11] = chunk4;
                            n13.j(chunk4);
                            n13.s();
                            length11++;
                        }
                        Chunk chunk5 = new Chunk();
                        chunkArr4[length11] = chunk5;
                        n13.j(chunk5);
                        this.delayedChunk = chunkArr4;
                        break;
                    default:
                        if (n13.u(s)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    public static final class Contact extends gr8 {
        public static final int BLOCKED = 1;
        public static final int BOT = 1;
        public static final int EXTERNAL = 1;
        public static final int FEMALE = 2;
        public static final int HAS_WEBAPP = 3;
        public static final int IS_NULL = 0;
        public static final int MALE = 1;
        public static final int OFFICIAL = 0;
        public static final int PortalStatus_BLOCKED = 0;
        public static final int PortalStatus_REMOVED = 1;
        public static final int REMOVED = 2;
        public static final int SERVICE_ACCOUNT = 2;
        public static final int UNKNOWN = 0;
        public static final int USER_LIST = 0;
        private static volatile Contact[] _emptyArray;
        public String baseRawUrl;
        public String baseUrl;
        public String birthday;
        public String description;
        public String deviceAvatarUrl;
        public String deviceName;
        public int gender;
        public long lastSearchClickTime;
        public long lastShowingUnknownContactBar;
        public long lastSyncTime;
        public long lastUpdateTime;
        public String link;
        public MenuButton menuButton;
        public ContactName[] names;
        public int[] options;
        public long photoId;
        public int portalStatus;
        public int[] profileOptions;
        public long serverId;
        public long serverPhone;
        public int settings;
        public int status;
        public int type;
        public long unbindOkPanelCloseTime;

        public static final class ContactName extends gr8 {
            public static final int CUSTOM = 1;
            public static final int DEVICE = 2;
            public static final int ONEME = 3;
            public static final int UNKNOWN = 0;
            private static volatile ContactName[] _emptyArray;
            public String lastName;
            public String name;
            public int type;

            public ContactName() {
                clear();
            }

            public static ContactName[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ContactName[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ContactName parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new ContactName(), bArr);
            }

            public ContactName clear() {
                this.name = "";
                this.type = 0;
                this.lastName = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int l = !this.name.equals("") ? o13.l(1, this.name) : 0;
                int i = this.type;
                if (i != 0) {
                    l += o13.f(2, i);
                }
                return !this.lastName.equals("") ? l + o13.l(3, this.lastName) : l;
            }

            public void writeTo(o13 o13) throws IOException {
                if (!this.name.equals("")) {
                    o13.E(1, this.name);
                }
                int i = this.type;
                if (i != 0) {
                    o13.w(2, i);
                }
                if (!this.lastName.equals("")) {
                    o13.E(3, this.lastName);
                }
            }

            public static ContactName parseFrom(n13 n13) throws IOException {
                return new ContactName().mergeFrom(n13);
            }

            public ContactName mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 10) {
                        this.name = n13.r();
                    } else if (s == 16) {
                        int p = n13.p();
                        if (p == 0 || p == 1 || p == 2 || p == 3) {
                            this.type = p;
                        }
                    } else if (s == 26) {
                        this.lastName = n13.r();
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class MenuButton extends gr8 {
            private static volatile MenuButton[] _emptyArray;
            public String text;

            public MenuButton() {
                clear();
            }

            public static MenuButton[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new MenuButton[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static MenuButton parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new MenuButton(), bArr);
            }

            public MenuButton clear() {
                this.text = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                if (!this.text.equals("")) {
                    return o13.l(1, this.text);
                }
                return 0;
            }

            public void writeTo(o13 o13) throws IOException {
                if (!this.text.equals("")) {
                    o13.E(1, this.text);
                }
            }

            public static MenuButton parseFrom(n13 n13) throws IOException {
                return new MenuButton().mergeFrom(n13);
            }

            public MenuButton mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 10) {
                        this.text = n13.r();
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public Contact() {
            clear();
        }

        public static Contact[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Contact[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Contact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new Contact(), bArr);
        }

        public Contact clear() {
            this.serverId = 0;
            this.deviceAvatarUrl = "";
            this.deviceName = "";
            this.lastUpdateTime = 0;
            this.serverPhone = 0;
            this.status = 0;
            this.type = 0;
            this.gender = 0;
            this.settings = 0;
            this.names = ContactName.emptyArray();
            int[] iArr = iu7.k;
            this.options = iArr;
            this.description = "";
            this.link = "";
            this.birthday = "";
            this.photoId = 0;
            this.baseUrl = "";
            this.baseRawUrl = "";
            this.unbindOkPanelCloseTime = 0;
            this.lastSearchClickTime = 0;
            this.lastSyncTime = 0;
            this.lastShowingUnknownContactBar = 0;
            this.portalStatus = 0;
            this.menuButton = null;
            this.profileOptions = iArr;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int[] iArr;
            long j = this.serverId;
            int i = 0;
            int h = j != 0 ? o13.h(1, j) : 0;
            if (!this.deviceAvatarUrl.equals("")) {
                h += o13.l(4, this.deviceAvatarUrl);
            }
            if (!this.deviceName.equals("")) {
                h += o13.l(6, this.deviceName);
            }
            long j2 = this.lastUpdateTime;
            if (j2 != 0) {
                h += o13.h(8, j2);
            }
            long j3 = this.serverPhone;
            if (j3 != 0) {
                h += o13.h(9, j3);
            }
            int i2 = this.status;
            if (i2 != 0) {
                h += o13.f(10, i2);
            }
            int i3 = this.type;
            if (i3 != 0) {
                h += o13.f(11, i3);
            }
            int i4 = this.gender;
            if (i4 != 0) {
                h += o13.f(12, i4);
            }
            int i5 = this.settings;
            if (i5 != 0) {
                h += o13.f(13, i5);
            }
            ContactName[] contactNameArr = this.names;
            if (contactNameArr != null && contactNameArr.length > 0) {
                int i6 = 0;
                while (true) {
                    gr8[] gr8Arr = this.names;
                    if (i6 >= gr8Arr.length) {
                        break;
                    }
                    gr8 gr8 = gr8Arr[i6];
                    if (gr8 != null) {
                        h = o13.i(14, gr8) + h;
                    }
                    i6++;
                }
            }
            int[] iArr2 = this.options;
            if (iArr2 != null && iArr2.length > 0) {
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    iArr = this.options;
                    if (i7 >= iArr.length) {
                        break;
                    }
                    i8 += o13.g(iArr[i7]);
                    i7++;
                }
                h = h + i8 + iArr.length;
            }
            if (!this.description.equals("")) {
                h += o13.l(16, this.description);
            }
            if (!this.link.equals("")) {
                h += o13.l(17, this.link);
            }
            if (!this.birthday.equals("")) {
                h += o13.l(18, this.birthday);
            }
            long j4 = this.photoId;
            if (j4 != 0) {
                h += o13.h(19, j4);
            }
            if (!this.baseUrl.equals("")) {
                h += o13.l(20, this.baseUrl);
            }
            if (!this.baseRawUrl.equals("")) {
                h += o13.l(21, this.baseRawUrl);
            }
            long j5 = this.unbindOkPanelCloseTime;
            if (j5 != 0) {
                h += o13.h(22, j5);
            }
            long j6 = this.lastSearchClickTime;
            if (j6 != 0) {
                h += o13.h(23, j6);
            }
            long j7 = this.lastSyncTime;
            if (j7 != 0) {
                h += o13.h(24, j7);
            }
            long j8 = this.lastShowingUnknownContactBar;
            if (j8 != 0) {
                h += o13.h(25, j8);
            }
            int i9 = this.portalStatus;
            if (i9 != 0) {
                h += o13.f(27, i9);
            }
            MenuButton menuButton2 = this.menuButton;
            if (menuButton2 != null) {
                h += o13.i(28, menuButton2);
            }
            int[] iArr3 = this.profileOptions;
            if (iArr3 == null || iArr3.length <= 0) {
                return h;
            }
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.profileOptions;
                if (i >= iArr4.length) {
                    return h + i10 + (iArr4.length * 2);
                }
                i10 += o13.g(iArr4[i]);
                i++;
            }
        }

        public void writeTo(o13 o13) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                o13.x(1, j);
            }
            if (!this.deviceAvatarUrl.equals("")) {
                o13.E(4, this.deviceAvatarUrl);
            }
            if (!this.deviceName.equals("")) {
                o13.E(6, this.deviceName);
            }
            long j2 = this.lastUpdateTime;
            if (j2 != 0) {
                o13.x(8, j2);
            }
            long j3 = this.serverPhone;
            if (j3 != 0) {
                o13.x(9, j3);
            }
            int i = this.status;
            if (i != 0) {
                o13.w(10, i);
            }
            int i2 = this.type;
            if (i2 != 0) {
                o13.w(11, i2);
            }
            int i3 = this.gender;
            if (i3 != 0) {
                o13.w(12, i3);
            }
            int i4 = this.settings;
            if (i4 != 0) {
                o13.w(13, i4);
            }
            ContactName[] contactNameArr = this.names;
            int i5 = 0;
            if (contactNameArr != null && contactNameArr.length > 0) {
                int i6 = 0;
                while (true) {
                    gr8[] gr8Arr = this.names;
                    if (i6 >= gr8Arr.length) {
                        break;
                    }
                    gr8 gr8 = gr8Arr[i6];
                    if (gr8 != null) {
                        o13.y(14, gr8);
                    }
                    i6++;
                }
            }
            int[] iArr = this.options;
            if (iArr != null && iArr.length > 0) {
                int i7 = 0;
                while (true) {
                    int[] iArr2 = this.options;
                    if (i7 >= iArr2.length) {
                        break;
                    }
                    o13.w(15, iArr2[i7]);
                    i7++;
                }
            }
            if (!this.description.equals("")) {
                o13.E(16, this.description);
            }
            if (!this.link.equals("")) {
                o13.E(17, this.link);
            }
            if (!this.birthday.equals("")) {
                o13.E(18, this.birthday);
            }
            long j4 = this.photoId;
            if (j4 != 0) {
                o13.x(19, j4);
            }
            if (!this.baseUrl.equals("")) {
                o13.E(20, this.baseUrl);
            }
            if (!this.baseRawUrl.equals("")) {
                o13.E(21, this.baseRawUrl);
            }
            long j5 = this.unbindOkPanelCloseTime;
            if (j5 != 0) {
                o13.x(22, j5);
            }
            long j6 = this.lastSearchClickTime;
            if (j6 != 0) {
                o13.x(23, j6);
            }
            long j7 = this.lastSyncTime;
            if (j7 != 0) {
                o13.x(24, j7);
            }
            long j8 = this.lastShowingUnknownContactBar;
            if (j8 != 0) {
                o13.x(25, j8);
            }
            int i8 = this.portalStatus;
            if (i8 != 0) {
                o13.w(27, i8);
            }
            MenuButton menuButton2 = this.menuButton;
            if (menuButton2 != null) {
                o13.y(28, menuButton2);
            }
            int[] iArr3 = this.profileOptions;
            if (iArr3 != null && iArr3.length > 0) {
                while (true) {
                    int[] iArr4 = this.profileOptions;
                    if (i5 < iArr4.length) {
                        o13.w(29, iArr4[i5]);
                        i5++;
                    } else {
                        return;
                    }
                }
            }
        }

        public static Contact parseFrom(n13 n13) throws IOException {
            return new Contact().mergeFrom(n13);
        }

        public Contact mergeFrom(n13 n13) throws IOException {
            while (true) {
                int s = n13.s();
                switch (s) {
                    case 0:
                        return this;
                    case 8:
                        this.serverId = n13.q();
                        break;
                    case 34:
                        this.deviceAvatarUrl = n13.r();
                        break;
                    case 50:
                        this.deviceName = n13.r();
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT:
                        this.lastUpdateTime = n13.q();
                        break;
                    case 72:
                        this.serverPhone = n13.q();
                        break;
                    case 80:
                        int p = n13.p();
                        if (p != 0 && p != 1 && p != 2) {
                            break;
                        } else {
                            this.status = p;
                            break;
                        }
                    case 88:
                        int p2 = n13.p();
                        if (p2 != 0 && p2 != 1) {
                            break;
                        } else {
                            this.type = p2;
                            break;
                        }
                    case 96:
                        int p3 = n13.p();
                        if (p3 != 0 && p3 != 1 && p3 != 2) {
                            break;
                        } else {
                            this.gender = p3;
                            break;
                        }
                    case 104:
                        this.settings = n13.p();
                        break;
                    case 114:
                        int z = iu7.z(n13, 114);
                        ContactName[] contactNameArr = this.names;
                        int length = contactNameArr == null ? 0 : contactNameArr.length;
                        int i = z + length;
                        ContactName[] contactNameArr2 = new ContactName[i];
                        if (length != 0) {
                            System.arraycopy(contactNameArr, 0, contactNameArr2, 0, length);
                        }
                        while (length < i - 1) {
                            ContactName contactName = new ContactName();
                            contactNameArr2[length] = contactName;
                            n13.j(contactName);
                            n13.s();
                            length++;
                        }
                        ContactName contactName2 = new ContactName();
                        contactNameArr2[length] = contactName2;
                        n13.j(contactName2);
                        this.names = contactNameArr2;
                        break;
                    case 120:
                        int z2 = iu7.z(n13, 120);
                        int[] iArr = new int[z2];
                        int i2 = 0;
                        for (int i3 = 0; i3 < z2; i3++) {
                            if (i3 != 0) {
                                n13.s();
                            }
                            int p4 = n13.p();
                            if (p4 == 0 || p4 == 1 || p4 == 2 || p4 == 3) {
                                iArr[i2] = p4;
                                i2++;
                            }
                        }
                        if (i2 != 0) {
                            int[] iArr2 = this.options;
                            int length2 = iArr2 == null ? 0 : iArr2.length;
                            if (length2 != 0 || i2 != z2) {
                                int[] iArr3 = new int[(length2 + i2)];
                                if (length2 != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length2);
                                }
                                System.arraycopy(iArr, 0, iArr3, length2, i2);
                                this.options = iArr3;
                                break;
                            } else {
                                this.options = iArr;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 122:
                        int e = n13.e(n13.p());
                        int c = n13.c();
                        int i4 = 0;
                        while (n13.b() > 0) {
                            int p5 = n13.p();
                            if (p5 == 0 || p5 == 1 || p5 == 2 || p5 == 3) {
                                i4++;
                            }
                        }
                        if (i4 != 0) {
                            n13.t(c);
                            int[] iArr4 = this.options;
                            int length3 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[(i4 + length3)];
                            if (length3 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length3);
                            }
                            while (n13.b() > 0) {
                                int p6 = n13.p();
                                if (p6 == 0 || p6 == 1 || p6 == 2 || p6 == 3) {
                                    iArr5[length3] = p6;
                                    length3++;
                                }
                            }
                            this.options = iArr5;
                        }
                        n13.d(e);
                        break;
                    case 130:
                        this.description = n13.r();
                        break;
                    case 138:
                        this.link = n13.r();
                        break;
                    case 146:
                        this.birthday = n13.r();
                        break;
                    case 152:
                        this.photoId = n13.q();
                        break;
                    case 162:
                        this.baseUrl = n13.r();
                        break;
                    case 170:
                        this.baseRawUrl = n13.r();
                        break;
                    case 176:
                        this.unbindOkPanelCloseTime = n13.q();
                        break;
                    case 184:
                        this.lastSearchClickTime = n13.q();
                        break;
                    case 192:
                        this.lastSyncTime = n13.q();
                        break;
                    case 200:
                        this.lastShowingUnknownContactBar = n13.q();
                        break;
                    case 216:
                        int p7 = n13.p();
                        if (p7 != 0 && p7 != 1) {
                            break;
                        } else {
                            this.portalStatus = p7;
                            break;
                        }
                    case 226:
                        if (this.menuButton == null) {
                            this.menuButton = new MenuButton();
                        }
                        n13.j(this.menuButton);
                        break;
                    case 232:
                        int z3 = iu7.z(n13, 232);
                        int[] iArr6 = this.profileOptions;
                        int length4 = iArr6 == null ? 0 : iArr6.length;
                        int i5 = z3 + length4;
                        int[] iArr7 = new int[i5];
                        if (length4 != 0) {
                            System.arraycopy(iArr6, 0, iArr7, 0, length4);
                        }
                        while (length4 < i5 - 1) {
                            iArr7[length4] = n13.p();
                            n13.s();
                            length4++;
                        }
                        iArr7[length4] = n13.p();
                        this.profileOptions = iArr7;
                        break;
                    case 234:
                        int e2 = n13.e(n13.p());
                        int c2 = n13.c();
                        int i6 = 0;
                        while (n13.b() > 0) {
                            n13.p();
                            i6++;
                        }
                        n13.t(c2);
                        int[] iArr8 = this.profileOptions;
                        int length5 = iArr8 == null ? 0 : iArr8.length;
                        int i7 = i6 + length5;
                        int[] iArr9 = new int[i7];
                        if (length5 != 0) {
                            System.arraycopy(iArr8, 0, iArr9, 0, length5);
                        }
                        while (length5 < i7) {
                            iArr9[length5] = n13.p();
                            length5++;
                        }
                        this.profileOptions = iArr9;
                        n13.d(e2);
                        break;
                    default:
                        if (n13.u(s)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    public static final class LogEvent extends gr8 {
        private static volatile LogEvent[] _emptyArray;
        public String event;
        public byte[] params;
        public long sessionId;
        public long time;
        public String type;
        public long userId;

        public LogEvent() {
            clear();
        }

        public static LogEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LogEvent[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static LogEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new LogEvent(), bArr);
        }

        public LogEvent clear() {
            this.time = 0;
            this.type = "";
            this.event = "";
            this.params = iu7.o;
            this.userId = 0;
            this.sessionId = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.time;
            int h = j != 0 ? o13.h(1, j) : 0;
            if (!this.type.equals("")) {
                h += o13.l(2, this.type);
            }
            if (!this.event.equals("")) {
                h += o13.l(3, this.event);
            }
            if (!Arrays.equals(this.params, iu7.o)) {
                h += o13.b(4, this.params);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                h += o13.h(5, j2);
            }
            long j3 = this.sessionId;
            return j3 != 0 ? h + o13.h(6, j3) : h;
        }

        public void writeTo(o13 o13) throws IOException {
            long j = this.time;
            if (j != 0) {
                o13.x(1, j);
            }
            if (!this.type.equals("")) {
                o13.E(2, this.type);
            }
            if (!this.event.equals("")) {
                o13.E(3, this.event);
            }
            if (!Arrays.equals(this.params, iu7.o)) {
                o13.s(4, this.params);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                o13.x(5, j2);
            }
            long j3 = this.sessionId;
            if (j3 != 0) {
                o13.x(6, j3);
            }
        }

        public static LogEvent parseFrom(n13 n13) throws IOException {
            return new LogEvent().mergeFrom(n13);
        }

        public LogEvent mergeFrom(n13 n13) throws IOException {
            while (true) {
                int s = n13.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.time = n13.q();
                } else if (s == 18) {
                    this.type = n13.r();
                } else if (s == 26) {
                    this.event = n13.r();
                } else if (s == 34) {
                    this.params = n13.g();
                } else if (s == 40) {
                    this.userId = n13.q();
                } else if (s == 48) {
                    this.sessionId = n13.q();
                } else if (!n13.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class LongList extends gr8 {
        private static volatile LongList[] _emptyArray;
        public long[] value;

        public LongList() {
            clear();
        }

        public static LongList[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LongList[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static LongList parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new LongList(), bArr);
        }

        public LongList clear() {
            this.value = iu7.l;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long[] jArr = this.value;
            int i = 0;
            if (jArr == null || jArr.length <= 0) {
                return 0;
            }
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.value;
                if (i >= jArr2.length) {
                    return i2 + jArr2.length;
                }
                i2 += o13.k(jArr2[i]);
                i++;
            }
        }

        public void writeTo(o13 o13) throws IOException {
            long[] jArr = this.value;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.value;
                    if (i < jArr2.length) {
                        o13.x(1, jArr2[i]);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        public static LongList parseFrom(n13 n13) throws IOException {
            return new LongList().mergeFrom(n13);
        }

        public LongList mergeFrom(n13 n13) throws IOException {
            while (true) {
                int s = n13.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    int z = iu7.z(n13, 8);
                    long[] jArr = this.value;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = z + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = n13.q();
                        n13.s();
                        length++;
                    }
                    jArr2[length] = n13.q();
                    this.value = jArr2;
                } else if (s == 10) {
                    int e = n13.e(n13.p());
                    int c = n13.c();
                    int i2 = 0;
                    while (n13.b() > 0) {
                        n13.q();
                        i2++;
                    }
                    n13.t(c);
                    long[] jArr3 = this.value;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = n13.q();
                        length2++;
                    }
                    this.value = jArr4;
                    n13.d(e);
                } else if (!n13.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MessageElement extends gr8 {
        public static final int ANIMOJI = 10;
        public static final int CODE = 9;
        public static final int EMPHASIZED = 4;
        public static final int GROUP_MENTION = 1;
        public static final int HEADING = 8;
        public static final int LINK = 5;
        public static final int MONOSPACED = 3;
        public static final int STRIKETHROUGH = 6;
        public static final int STRONG = 2;
        public static final int UNDERLINE = 7;
        public static final int USER_MENTION = 0;
        private static volatile MessageElement[] _emptyArray;
        public long entityId;
        public String entityName;
        public int from;
        public int length;
        public LinkAttributes linkAttributes;
        public int type;

        public static final class LinkAttributes extends gr8 {
            private static volatile LinkAttributes[] _emptyArray;
            public String url;

            public LinkAttributes() {
                clear();
            }

            public static LinkAttributes[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (tz6.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LinkAttributes[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static LinkAttributes parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return gr8.mergeFrom(new LinkAttributes(), bArr);
            }

            public LinkAttributes clear() {
                this.url = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                if (!this.url.equals("")) {
                    return o13.l(1, this.url);
                }
                return 0;
            }

            public void writeTo(o13 o13) throws IOException {
                if (!this.url.equals("")) {
                    o13.E(1, this.url);
                }
            }

            public static LinkAttributes parseFrom(n13 n13) throws IOException {
                return new LinkAttributes().mergeFrom(n13);
            }

            public LinkAttributes mergeFrom(n13 n13) throws IOException {
                while (true) {
                    int s = n13.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 10) {
                        this.url = n13.r();
                    } else if (!n13.u(s)) {
                        return this;
                    }
                }
            }
        }

        public MessageElement() {
            clear();
        }

        public static MessageElement[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageElement[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageElement parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new MessageElement(), bArr);
        }

        public MessageElement clear() {
            this.entityId = 0;
            this.entityName = "";
            this.type = 0;
            this.from = 0;
            this.length = 0;
            this.linkAttributes = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.entityId;
            int h = j != 0 ? o13.h(1, j) : 0;
            if (!this.entityName.equals("")) {
                h += o13.l(2, this.entityName);
            }
            int i = this.type;
            if (i != 0) {
                h += o13.f(3, i);
            }
            int i2 = this.from;
            if (i2 != 0) {
                h += o13.f(4, i2);
            }
            int i3 = this.length;
            if (i3 != 0) {
                h += o13.f(5, i3);
            }
            LinkAttributes linkAttributes2 = this.linkAttributes;
            return linkAttributes2 != null ? h + o13.i(6, linkAttributes2) : h;
        }

        public void writeTo(o13 o13) throws IOException {
            long j = this.entityId;
            if (j != 0) {
                o13.x(1, j);
            }
            if (!this.entityName.equals("")) {
                o13.E(2, this.entityName);
            }
            int i = this.type;
            if (i != 0) {
                o13.w(3, i);
            }
            int i2 = this.from;
            if (i2 != 0) {
                o13.w(4, i2);
            }
            int i3 = this.length;
            if (i3 != 0) {
                o13.w(5, i3);
            }
            LinkAttributes linkAttributes2 = this.linkAttributes;
            if (linkAttributes2 != null) {
                o13.y(6, linkAttributes2);
            }
        }

        public static MessageElement parseFrom(n13 n13) throws IOException {
            return new MessageElement().mergeFrom(n13);
        }

        public MessageElement mergeFrom(n13 n13) throws IOException {
            while (true) {
                int s = n13.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.entityId = n13.q();
                } else if (s != 18) {
                    if (s == 24) {
                        int p = n13.p();
                        switch (p) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                this.type = p;
                                break;
                        }
                    } else if (s == 32) {
                        this.from = n13.p();
                    } else if (s == 40) {
                        this.length = n13.p();
                    } else if (s == 50) {
                        if (this.linkAttributes == null) {
                            this.linkAttributes = new LinkAttributes();
                        }
                        n13.j(this.linkAttributes);
                    } else if (!n13.u(s)) {
                        return this;
                    }
                } else {
                    this.entityName = n13.r();
                }
            }
        }
    }

    public static final class MessageElements extends gr8 {
        private static volatile MessageElements[] _emptyArray;
        public MessageElement[] elements;

        public MessageElements() {
            clear();
        }

        public static MessageElements[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageElements[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageElements parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new MessageElements(), bArr);
        }

        public MessageElements clear() {
            this.elements = MessageElement.emptyArray();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            MessageElement[] messageElementArr = this.elements;
            int i = 0;
            if (messageElementArr == null || messageElementArr.length <= 0) {
                return 0;
            }
            int i2 = 0;
            while (true) {
                gr8[] gr8Arr = this.elements;
                if (i >= gr8Arr.length) {
                    return i2;
                }
                gr8 gr8 = gr8Arr[i];
                if (gr8 != null) {
                    i2 = o13.i(1, gr8) + i2;
                }
                i++;
            }
        }

        public void writeTo(o13 o13) throws IOException {
            MessageElement[] messageElementArr = this.elements;
            if (messageElementArr != null && messageElementArr.length > 0) {
                int i = 0;
                while (true) {
                    gr8[] gr8Arr = this.elements;
                    if (i < gr8Arr.length) {
                        gr8 gr8 = gr8Arr[i];
                        if (gr8 != null) {
                            o13.y(1, gr8);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        public static MessageElements parseFrom(n13 n13) throws IOException {
            return new MessageElements().mergeFrom(n13);
        }

        public MessageElements mergeFrom(n13 n13) throws IOException {
            while (true) {
                int s = n13.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    int z = iu7.z(n13, 10);
                    MessageElement[] messageElementArr = this.elements;
                    int length = messageElementArr == null ? 0 : messageElementArr.length;
                    int i = z + length;
                    MessageElement[] messageElementArr2 = new MessageElement[i];
                    if (length != 0) {
                        System.arraycopy(messageElementArr, 0, messageElementArr2, 0, length);
                    }
                    while (length < i - 1) {
                        MessageElement messageElement = new MessageElement();
                        messageElementArr2[length] = messageElement;
                        n13.j(messageElement);
                        n13.s();
                        length++;
                    }
                    MessageElement messageElement2 = new MessageElement();
                    messageElementArr2[length] = messageElement2;
                    n13.j(messageElement2);
                    this.elements = messageElementArr2;
                } else if (!n13.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MessagePreview extends gr8 {
        private static volatile MessagePreview[] _emptyArray;
        public Attaches attaches;
        public String text;

        public MessagePreview() {
            clear();
        }

        public static MessagePreview[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessagePreview[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessagePreview parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new MessagePreview(), bArr);
        }

        public MessagePreview clear() {
            this.text = "";
            this.attaches = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int l = !this.text.equals("") ? o13.l(1, this.text) : 0;
            Attaches attaches2 = this.attaches;
            return attaches2 != null ? l + o13.i(2, attaches2) : l;
        }

        public void writeTo(o13 o13) throws IOException {
            if (!this.text.equals("")) {
                o13.E(1, this.text);
            }
            Attaches attaches2 = this.attaches;
            if (attaches2 != null) {
                o13.y(2, attaches2);
            }
        }

        public static MessagePreview parseFrom(n13 n13) throws IOException {
            return new MessagePreview().mergeFrom(n13);
        }

        public MessagePreview mergeFrom(n13 n13) throws IOException {
            while (true) {
                int s = n13.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    this.text = n13.r();
                } else if (s == 18) {
                    if (this.attaches == null) {
                        this.attaches = new Attaches();
                    }
                    n13.j(this.attaches);
                } else if (!n13.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MessageReactionWithCount extends gr8 {
        private static volatile MessageReactionWithCount[] _emptyArray;
        public int count;
        public ReactionData reaction;

        public MessageReactionWithCount() {
            clear();
        }

        public static MessageReactionWithCount[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageReactionWithCount[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageReactionWithCount parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new MessageReactionWithCount(), bArr);
        }

        public MessageReactionWithCount clear() {
            this.reaction = null;
            this.count = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            ReactionData reactionData = this.reaction;
            int i = reactionData != null ? o13.i(1, reactionData) : 0;
            int i2 = this.count;
            return i2 != 0 ? i + o13.f(2, i2) : i;
        }

        public void writeTo(o13 o13) throws IOException {
            ReactionData reactionData = this.reaction;
            if (reactionData != null) {
                o13.y(1, reactionData);
            }
            int i = this.count;
            if (i != 0) {
                o13.w(2, i);
            }
        }

        public static MessageReactionWithCount parseFrom(n13 n13) throws IOException {
            return new MessageReactionWithCount().mergeFrom(n13);
        }

        public MessageReactionWithCount mergeFrom(n13 n13) throws IOException {
            while (true) {
                int s = n13.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    if (this.reaction == null) {
                        this.reaction = new ReactionData();
                    }
                    n13.j(this.reaction);
                } else if (s == 16) {
                    this.count = n13.p();
                } else if (!n13.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MessageReactions extends gr8 {
        private static volatile MessageReactions[] _emptyArray;
        public MessageReactionWithCount[] reactions;
        public int totalCount;
        public ReactionData yourReaction;

        public MessageReactions() {
            clear();
        }

        public static MessageReactions[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageReactions[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageReactions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new MessageReactions(), bArr);
        }

        public MessageReactions clear() {
            this.reactions = MessageReactionWithCount.emptyArray();
            this.totalCount = 0;
            this.yourReaction = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
            int i = 0;
            if (messageReactionWithCountArr != null && messageReactionWithCountArr.length > 0) {
                int i2 = 0;
                while (true) {
                    gr8[] gr8Arr = this.reactions;
                    if (i >= gr8Arr.length) {
                        break;
                    }
                    gr8 gr8 = gr8Arr[i];
                    if (gr8 != null) {
                        i2 = o13.i(1, gr8) + i2;
                    }
                    i++;
                }
                i = i2;
            }
            int i3 = this.totalCount;
            if (i3 != 0) {
                i += o13.f(2, i3);
            }
            ReactionData reactionData = this.yourReaction;
            return reactionData != null ? i + o13.i(3, reactionData) : i;
        }

        public void writeTo(o13 o13) throws IOException {
            MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
            if (messageReactionWithCountArr != null && messageReactionWithCountArr.length > 0) {
                int i = 0;
                while (true) {
                    gr8[] gr8Arr = this.reactions;
                    if (i >= gr8Arr.length) {
                        break;
                    }
                    gr8 gr8 = gr8Arr[i];
                    if (gr8 != null) {
                        o13.y(1, gr8);
                    }
                    i++;
                }
            }
            int i2 = this.totalCount;
            if (i2 != 0) {
                o13.w(2, i2);
            }
            ReactionData reactionData = this.yourReaction;
            if (reactionData != null) {
                o13.y(3, reactionData);
            }
        }

        public static MessageReactions parseFrom(n13 n13) throws IOException {
            return new MessageReactions().mergeFrom(n13);
        }

        public MessageReactions mergeFrom(n13 n13) throws IOException {
            while (true) {
                int s = n13.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    int z = iu7.z(n13, 10);
                    MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
                    int length = messageReactionWithCountArr == null ? 0 : messageReactionWithCountArr.length;
                    int i = z + length;
                    MessageReactionWithCount[] messageReactionWithCountArr2 = new MessageReactionWithCount[i];
                    if (length != 0) {
                        System.arraycopy(messageReactionWithCountArr, 0, messageReactionWithCountArr2, 0, length);
                    }
                    while (length < i - 1) {
                        MessageReactionWithCount messageReactionWithCount = new MessageReactionWithCount();
                        messageReactionWithCountArr2[length] = messageReactionWithCount;
                        n13.j(messageReactionWithCount);
                        n13.s();
                        length++;
                    }
                    MessageReactionWithCount messageReactionWithCount2 = new MessageReactionWithCount();
                    messageReactionWithCountArr2[length] = messageReactionWithCount2;
                    n13.j(messageReactionWithCount2);
                    this.reactions = messageReactionWithCountArr2;
                } else if (s == 16) {
                    this.totalCount = n13.p();
                } else if (s == 26) {
                    if (this.yourReaction == null) {
                        this.yourReaction = new ReactionData();
                    }
                    n13.j(this.yourReaction);
                } else if (!n13.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class PendingUploadData extends gr8 {
        private static volatile PendingUploadData[] _emptyArray;
        public Map<Long, String> pendingMap;

        public PendingUploadData() {
            clear();
        }

        public static PendingUploadData[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new PendingUploadData[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static PendingUploadData parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new PendingUploadData(), bArr);
        }

        public PendingUploadData clear() {
            this.pendingMap = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            Map<Long, String> map = this.pendingMap;
            if (map != null) {
                return tz6.a(map, 1, 3, 9);
            }
            return 0;
        }

        public PendingUploadData mergeFrom(n13 n13) throws IOException {
            mt7 mt7 = xy6.d;
            while (true) {
                int s = n13.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    this.pendingMap = tz6.b(n13, this.pendingMap, mt7, 3, 9, (gr8) null, 8, 18);
                } else if (!n13.u(s)) {
                    return this;
                }
            }
        }

        public void writeTo(o13 o13) throws IOException {
            Map<Long, String> map = this.pendingMap;
            if (map != null) {
                tz6.d(o13, map, 1, 3, 9);
            }
        }

        public static PendingUploadData parseFrom(n13 n13) throws IOException {
            return new PendingUploadData().mergeFrom(n13);
        }
    }

    public static final class ReactionData extends gr8 {
        public static final int EMOJI = 0;
        public static final int STICKER = 1;
        private static volatile ReactionData[] _emptyArray;
        public String reaction;
        public int type;

        public ReactionData() {
            clear();
        }

        public static ReactionData[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (tz6.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ReactionData[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ReactionData parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return gr8.mergeFrom(new ReactionData(), bArr);
        }

        public ReactionData clear() {
            this.type = 0;
            this.reaction = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int i = this.type;
            int f = i != 0 ? o13.f(1, i) : 0;
            return !this.reaction.equals("") ? f + o13.l(2, this.reaction) : f;
        }

        public void writeTo(o13 o13) throws IOException {
            int i = this.type;
            if (i != 0) {
                o13.w(1, i);
            }
            if (!this.reaction.equals("")) {
                o13.E(2, this.reaction);
            }
        }

        public static ReactionData parseFrom(n13 n13) throws IOException {
            return new ReactionData().mergeFrom(n13);
        }

        public ReactionData mergeFrom(n13 n13) throws IOException {
            while (true) {
                int s = n13.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    int p = n13.p();
                    if (p == 0 || p == 1) {
                        this.type = p;
                    }
                } else if (s == 18) {
                    this.reaction = n13.r();
                } else if (!n13.u(s)) {
                    return this;
                }
            }
        }
    }
}
