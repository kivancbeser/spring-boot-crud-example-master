import Vue from 'vue'
import App from './App.vue'
import router from './router'
import vuetify from './plugins/vuetify';
import axios from 'axios'
import VueAxios from 'vue-axios'
import moment from 'moment'
import 'material-design-icons-iconfont/dist/material-design-icons.css'

Vue.config.productionTip = false
axios.defaults.headers.common['Access-Control-Allow-Origin'] = '*';
Vue.prototype.moment = moment

Vue.use(moment);
Vue.use(VueAxios, axios)


new Vue({
  router,
  vuetify,
  render: h => h(App)
}).$mount('#app')
