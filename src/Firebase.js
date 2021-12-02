import firebase from "firebase";

const firebaseConfig = {
  apiKey: "AIzaSyDuSHk_lPekdi2HKyPbI6Iszh9CpFoNEXs",
  authDomain: "twitter-clone-b6e4f.firebaseapp.com",
  databaseURL: "https://twitter-clone-b6e4f-default-rtdb.firebaseio.com",
  projectId: "twitter-clone-b6e4f",
  storageBucket: "twitter-clone-b6e4f.appspot.com",
  messagingSenderId: "429551023634",
  appId: "1:429551023634:web:ba274502c983238a818acb",
  measurementId: "G-27TC5ZZ5DS"
};

// Initialize Firebase
const firebaseApp = firebase.initializeApp(firebaseConfig);
// const analytics = getAnalytics(app);
const db = firebaseApp.firestore();
// const db = getFirestore(app);
export default db;