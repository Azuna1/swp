import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `ap-artikleerstellen`
 *
 * ApArtikleerstellen element.
 *
 * @customElement
 * @polymer
 */
class ApArtikleerstellen extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'ap-artikleerstellen';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(ApArtikleerstellen.is, ApArtikleerstellen);
