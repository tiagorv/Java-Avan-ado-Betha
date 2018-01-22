import ListController from './list.controller'
import FormController from './form.controller'

import FamiliaServico from './servico'

export const familiaConfig = (modulo) => {

  modulo.service('FamiliaServico', FamiliaServico)
  
  return ['$stateProvider', '$urlRouterProvider', 
   ($stateProvider, $urlRouterProvider) => {
    $stateProvider
      .state('familia', {
        template: require('@views/default.html'),
        url: '/familias',
        onEnter: ['$state', function($state) {
          $state.go('familia.list')
        }]
      })
      .state('familia.list', {
        template: require('@views/familias/list.html'),
        url: '/list',
        controller: ListController,
        controllerAs: 'vm'
      })
      .state('familia.new', {
        template: require('@views/familias/form.html'),
        url: '/new',
        controller: FormController,
        controllerAs: 'vm'
      })
      .state('familia.edit', {
        template: require('@views/familias/form.html'),
        url: '/{id}',
        controller: FormController,
        controllerAs: 'vm'
      });
  }]
}
