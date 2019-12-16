<<<<<<< HEAD
import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class ApArtikleerstellen extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-button theme="tertiary" style="width:14%;  height: 50px;font-size: 10px;border: 2px solid #008CBA;">
  Shop
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:14%;  height: 50px;font-size: 10px;border: 2px solid #008CBA;">
  Warenkorb
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:14%;  height: 50px;font-size: 10px;border: 2px solid #008CBA;">
  Artikel erstellen
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:14%;  height: 50px;font-size: 10px;border: 2px solid #008CBA;">
  Artikel verwalten
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:17%;  height: 50px;font-size: 10px;border: 2px solid #008CBA;">
  Bestellungen verwalten
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:14%;  height: 50px;font-size: 10px;border: 2px solid #008CBA;">
  Settings
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:12%;  height: 50px;font-size: 10px;border: 2px solid #008CBA;">
  Logout
 </vaadin-button>
</vaadin-horizontal-layout>
<vaadin-text-field label="" placeholder="Artikelname" style="position:relative;left:395px; top:-500px;"></vaadin-text-field>
<vaadin-combo-box style="position:relative;left:205px; top:-450px;" placeholder="Kategorie"></vaadin-combo-box>
<vaadin-combo-box style="position:relative;left:13px; top:-400px;" placeholder="Anzahl"></vaadin-combo-box>
<vaadin-text-field style="position:relative;left:397px; top:-425px;" placeholder="Preis"></vaadin-text-field>
<vaadin-text-area label="Write a description" placeholder="Add detailed explanation"></vaadin-text-area>
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
=======
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
>>>>>>> c7e410e265b6510fddbdd03c70538118932821f5
