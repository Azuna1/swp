import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-login/src/vaadin-login-form.js';

class TestLogin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-login-form no-forgot-password id="vaadinLoginForm"></vaadin-login-form>
`;
    }

    static get is() {
        return 'test-login';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(TestLogin.is, TestLogin);
